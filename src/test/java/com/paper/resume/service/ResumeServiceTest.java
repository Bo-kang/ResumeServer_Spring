package com.paper.resume.service;

import com.paper.resume.domain.*;
import com.paper.resume.persistence.MemberRepository;
import com.paper.resume.persistence.OccupationRepository;
import com.paper.resume.persistence.ResumeRepository;
import com.paper.resume.persistence.SkillRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;

@SpringBootTest
public class ResumeServiceTest {
    @Autowired
    ResumeServiceImpl resumeService;

    @Autowired
    MemberRepository memberRepo;

    @Autowired
    SkillRepository skillRepo;

    @Autowired
    ResumeRepository resumeRepo;

    @Autowired
    OccupationRepository occuRepo;

    @Test
    public void RegisterResumeTest1(){
        Member member = new Member();
        Job job = new Job();
        SkillStack skillStack = new SkillStack();

        member.setId("resumeTest4");
        member.setEmail("resumeTest1@resumeTest");
        member.setPassword("resumeTest");
        member.setRole("test");
        memberRepo.save(member);

        job.setDescription("MapCompiler");
        job.setCompanyName("Navis Ams");
        job.setHiredDate(new Date());
        job.setFiredDate(new Date());
        job.setOccupation(occuRepo.findByName("개발"));
        skillStack.setUsedYear(3);
        skillStack.setSkill(skillRepo.findBySkillName("C++"));

        resumeService.registerResume(member, skillStack,job);
    }

    @Test
    @Transactional
    public void GetResumeListTest1(){
        ArrayList<ResumeListResponseDTO> resList = resumeService.getResumeList();

        for(ResumeListResponseDTO iter : resList){
            System.out.println(iter.toString());
            System.out.println(iter.getSkillMap().toString());
        }
    }
}
