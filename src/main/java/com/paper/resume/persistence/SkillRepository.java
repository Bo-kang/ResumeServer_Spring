package com.paper.resume.persistence;

import com.paper.resume.domain.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
    public Skill findBySkillName(String skillName);
    public List<Skill> findBySkillNameContaining(String skillName);
    public List<Skill> findBySkillNameContains(String skillName);
}