package com.jpcchaves.hrworker.repositories;

import com.jpcchaves.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
