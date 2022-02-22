package com.paper.resume.persistence;

import com.paper.resume.domain.Resume;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ResumeRepository extends CrudRepository<Resume, Integer> {

}