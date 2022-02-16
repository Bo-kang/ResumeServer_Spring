package com.paper.resume.service;

import com.paper.resume.domain.Job;
import com.paper.resume.domain.Member;
import com.paper.resume.domain.SkillStack;
import com.paper.resume.persistence.MemberRepository;
import com.paper.resume.persistence.SkillRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class ResumeServiceTest {
    @Autowired
    ResumeServiceImpl resumeService;

    @Autowired
    MemberRepository memberRepo;

    @Autowired
    SkillRepository skillRepo;

    @Test
    public void RegisterResumeTest1(){
        Member member = new Member();
        Job job = new Job();
        SkillStack skillStack = new SkillStack();

        member.setId("resumeTest1");
        member.setEmail("resumeTest1@resumeTest");
        member.setPassword("resumeTest");
        member.setRole("test");
        memberRepo.save(member);

        job.setDescription("MapCompiler");
        job.setCompanyName("Navis Ams");
        job.setHiredDate(new Date());
        job.setFiredDate(new Date());

        skillStack.setUsedYear(3);
        skillStack.setSkill(skillRepo.findBySkillName("C++"));

        resumeService.RegisterResume(member, skillStack,job);
    }
}
