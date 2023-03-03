package com.jpcchaves.hrworker.resources;

import com.jpcchaves.hrworker.dto.WorkerResponseDto;
import com.jpcchaves.hrworker.services.WorkerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private Environment env;

    @Autowired
    private WorkerService service;

    @GetMapping
    public ResponseEntity<List<WorkerResponseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkerResponseDto> findById(@PathVariable Long id) {

        logger.info("PORT: " + env.getProperty("local.server.port"));

        return ResponseEntity.ok(service.findById(id));
    }
}
