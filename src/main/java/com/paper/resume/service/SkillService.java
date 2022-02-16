package com.paper.resume.service;

import com.paper.resume.domain.Skill;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SkillService {
    Skill GetSkill(Skill skill);
    List<Skill> GetSkillList(Skill skill);
}
