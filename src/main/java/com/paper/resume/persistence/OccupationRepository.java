package com.paper.resume.persistence;

import com.paper.resume.domain.Occupation;
import org.springframework.data.repository.CrudRepository;

public interface OccupationRepository extends CrudRepository<Occupation, Integer> {
}