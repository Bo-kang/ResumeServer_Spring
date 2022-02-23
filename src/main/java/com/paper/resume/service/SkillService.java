package com.paper.resume.service;

import com.paper.resume.domain.Skill;

import java.util.List;

public interface SkillService {

    public Skill getSkill(Skill skill);
    public List<Skill> getSkillList(Skill skill);
    public void insertSkill(Skill skill);
    public void insertSkillList(List<Skill> skillList);

}
