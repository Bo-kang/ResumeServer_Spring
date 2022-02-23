package com.paper.resume.controller;

import com.paper.resume.domain.Skill;
import com.paper.resume.service.SkillServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SkillController {
    private final SkillServiceImpl skillService;

    @GetMapping("/skillList")
    public List<Skill> getSkillList(Skill skill){
        List<Skill> skillList = skillService.getSkillList(skill);
        return skillList;
    }

    @PostMapping("/skill")
    public void insertSkill(Skill skill){
        skillService.insertSkill(skill);
    }

}
