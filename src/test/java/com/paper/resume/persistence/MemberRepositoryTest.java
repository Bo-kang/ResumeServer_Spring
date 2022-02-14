package com.paper.resume.persistence;

import com.paper.resume.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepo;

    @Test
    void registerMemberTest1(){
        Member member = new Member();
        member.setEmail("test1@test.com");
        member.setEnable(true);
        member.setCreatedDate(new Date());
        member.setPassword("test1");
        member.setId("test1");
        member.setRole("test");

        memberRepo.save(member);

        Member findMember = memberRepo.findById("test1");
        assertEquals(findMember.getId(),member.getId());
    }

    @Test
    void registerMemberTest2(){
        Member member = new Member();
        member.setEmail("test2@test.com");
        member.setPassword("test2");
        member.setId("test2");
        member.setRole("test");

        memberRepo.save(member);

        Member findMember = memberRepo.findById("test2");
        assertEquals(findMember.getId(),member.getId());
    }
}
