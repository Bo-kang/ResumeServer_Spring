package com.paper.resume.persistence;

import com.paper.resume.domain.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
    Skill findBySkillName(String skillName);
    ArrayList<Skill> findBySkillNameContaining(String skillName);
    ArrayList<Skill> findBySkillNameContains(String skillName);
}