package com.example.webfluxsample.repository;

import com.example.webfluxsample.domain.Schedule;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ScheduleRepository extends ReactiveCrudRepository<Schedule, Long> {
}
