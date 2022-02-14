package com.paper.resume.persistence;

import com.paper.resume.domain.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
}