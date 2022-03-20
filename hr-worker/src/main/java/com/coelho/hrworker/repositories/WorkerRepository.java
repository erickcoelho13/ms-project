package com.coelho.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelho.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
