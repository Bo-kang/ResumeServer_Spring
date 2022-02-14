package com.paper.resume.persistence;

import com.paper.resume.domain.Skill;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SkillRepositoryTest {
    @Autowired
    SkillRepository skillRepo;

    @Test
    public void registerSkillTest1(){
        Skill skill = new Skill();
        skill.setSkillName("C++");
        skillRepo.save(skill);
        Skill findSkill = skillRepo.findBySkillName("C++");

        assertEquals(skill.getSkillName(), findSkill.getSkillName());
    }

    @Test
    public void registerSkillTest2(){
        Skill skill = new Skill();
        skill.setSkillName("C");
        skillRepo.save(skill);
        Skill findSkill = skillRepo.findBySkillName("C");

        assertEquals(skill.getSkillName(), findSkill.getSkillName());
    }

    @Test
    public void findSkillTest1(){
        List<Skill> skillList = skillRepo.findBySkillNameContaining("C");

        assertEquals(2, skillList.size());
    }

    @Test
    public void findSkillTest2(){
        List<Skill> skillList = skillRepo.findBySkillNameContains("C");

        assertEquals(2, skillList.size());
    }
}
