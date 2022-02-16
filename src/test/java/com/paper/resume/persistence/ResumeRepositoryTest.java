package com.paper.resume.persistence;

import com.paper.resume.domain.Member;
import com.paper.resume.domain.Resume;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class ResumeRepositoryTest {
    @Autowired
    ResumeRepository resumeRepo;

    @Autowired
    MemberRepository memberRepo;

    @Test
    void resumeSaveTest1(){
        Member member = new Member();
        member.setEmail("resumeTest@resumeTest.com");
        member.setId("resumeTest");
        member.setPassword("resumeTest");
        memberRepo.save(member);

        Resume resume = new Resume();
        resume.setMember(member);
        resumeRepo.save(resume);
    }
}
