package com.jpcchaves.hrworker.resources;

import com.jpcchaves.hrworker.dto.WorkerResponseDto;
import com.jpcchaves.hrworker.entities.Worker;
import com.jpcchaves.hrworker.repositories.WorkerRepository;
import com.jpcchaves.hrworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerService service;

    @GetMapping
    public ResponseEntity<List<WorkerResponseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerResponseDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
