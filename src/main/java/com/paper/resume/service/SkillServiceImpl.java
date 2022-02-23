package com.paper.resume.service;

import com.paper.resume.domain.Skill;
import com.paper.resume.persistence.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService{

    private final SkillRepository skillRepo;

    @Autowired
    public SkillServiceImpl(SkillRepository skillRepo){
        this.skillRepo = skillRepo;
    }

    @Override
    public Skill getSkill(Skill skill) {
        return skillRepo.findBySkillName(skill.getSkillName());
    }

    @Override
    public List<Skill> getSkillList(Skill skill) {
        if(skill.getSkillName() == null)
            return (List<Skill>) skillRepo.findAll();
        else
            return skillRepo.findBySkillNameContaining(skill.getSkillName());
    }

    @Override
    public void insertSkill(Skill skill) {
        if(skill.getSkillName() == null)
            System.out.println("Need Skill Name");
        else
            skillRepo.save(skill);
    }

    @Override
    public void insertSkillList(List<Skill> skillList) {
        skillRepo.saveAll(skillList);
    }
}
