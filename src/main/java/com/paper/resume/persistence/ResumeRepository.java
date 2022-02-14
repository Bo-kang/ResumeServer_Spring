package com.paper.resume.persistence;

import com.paper.resume.domain.Resume;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends CrudRepository<Resume, Integer> {
}