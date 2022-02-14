package com.paper.resume;

import com.paper.resume.domain.Skill;
import com.paper.resume.persistence.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResumeServerApplicationTests {

    @Autowired
    SkillStackRepository skillStackRepo;

    @Autowired
    JobRepository jobRepo;

    @Test
    void contextLoads() {

    }

}
