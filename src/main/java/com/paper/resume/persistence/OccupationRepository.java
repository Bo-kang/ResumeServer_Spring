package com.paper.resume.persistence;

import com.paper.resume.domain.Occupation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OccupationRepository extends CrudRepository<Occupation, Integer> {
    Occupation findByName(String occupationName);
    List<Occupation> findAllByParentOccupation(Occupation occupation);

}