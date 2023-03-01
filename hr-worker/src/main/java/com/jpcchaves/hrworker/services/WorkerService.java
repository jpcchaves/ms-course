package com.jpcchaves.hrworker.services;

import com.jpcchaves.hrworker.dto.WorkerRequestDto;
import com.jpcchaves.hrworker.dto.WorkerResponseDto;
import com.jpcchaves.hrworker.entities.Worker;
import com.jpcchaves.hrworker.repositories.WorkerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkerService implements ICrudService<WorkerRequestDto, WorkerResponseDto>{

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<WorkerResponseDto> findAll() {
        var workersEntities = workerRepository.findAll();

        return workersEntities.stream()
                .map(worker -> modelMapper.map(worker, WorkerResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public WorkerResponseDto findById(Long id) {
        var worker = workerRepository.findById(id).orElseThrow(() -> new RuntimeException("worker not found"));
        return modelMapper.map(worker, WorkerResponseDto.class);
    }

    @Override
    public WorkerResponseDto create(WorkerRequestDto entity) {
        return null;
    }

    @Override
    public WorkerResponseDto update(Long id, WorkerRequestDto entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


}
