package com.paper.resume.service;

import com.paper.resume.domain.Skill;
import com.paper.resume.persistence.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillServiceImpl implements SkillService{

    private final SkillRepository skillRepo;

    @Autowired
    public SkillServiceImpl(SkillRepository skillRepo){
        this.skillRepo = skillRepo;
    }


    @Override
    public Skill GetSkill(Skill skill) {
        return skillRepo.findBySkillName(skill.getSkillName());
    }

    @Override
    public ArrayList<Skill> GetSkillList(Skill skill) {
        return skillRepo.findBySkillNameContains(skill.getSkillName());
    }
}
