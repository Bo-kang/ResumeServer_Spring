package com.paper.resume.persistence;

import com.paper.resume.domain.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer> {
}