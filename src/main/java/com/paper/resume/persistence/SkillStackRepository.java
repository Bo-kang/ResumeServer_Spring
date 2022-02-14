package com.paper.resume.persistence;

import com.paper.resume.domain.SkillStack;
import org.springframework.data.repository.CrudRepository;

public interface SkillStackRepository extends CrudRepository<SkillStack, Integer> {
}