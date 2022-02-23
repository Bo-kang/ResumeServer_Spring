package com.paper.resume.service;

import com.paper.resume.domain.Skill;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SkillServiceTest {

    @Autowired
    private SkillServiceImpl skillService;

    @Test
    public void GetSkillListTest1(){
        Skill skill = new Skill();
        List<Skill> skillList = skillService.getSkillList(skill);
        for(Skill iter : skillList){
            System.out.println(iter.toString());
        }
    }

    @Test
    public void GetSkillListTest2(){
        Skill skill = new Skill();
        skill.setSkillName("+");
        List<Skill> skillList = skillService.getSkillList(skill);
        for(Skill iter : skillList){
            System.out.println(iter.toString());
        }
    }
}
