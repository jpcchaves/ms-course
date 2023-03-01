package com.jpcchaves.hrworker.services;

import com.jpcchaves.hrworker.entities.Worker;
import com.jpcchaves.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService implements ICrudService<Worker, Worker>{

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    @Override
    public Worker findById(Long id) {
        return workerRepository.findById(id).orElseThrow(() -> new RuntimeException("worker not found"));
    }

    @Override
    public Worker create(Worker entity) {
        return null;
    }

    @Override
    public Worker update(Long id, Worker entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
