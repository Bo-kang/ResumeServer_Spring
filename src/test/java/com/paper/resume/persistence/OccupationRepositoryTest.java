package com.paper.resume.persistence;

import com.paper.resume.domain.Occupation;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OccupationRepositoryTest {
    @Autowired
    private OccupationRepository occupationRepo;

    @Test
    public void RegisterOccupationTest1(){
        Occupation occupation = new Occupation();
        occupation.setName("IT");

        occupationRepo.save(occupation);

        assertNotNull(occupationRepo.findByName("IT"));
    }

    @Test
    public void RegisterOccupationTest2(){
        Occupation occupation = new Occupation();
        occupation.setName("개발");
        occupation.setOccupation(occupationRepo.findByName("IT"));
        occupationRepo.save(occupation);

        Occupation occupation1 = new Occupation();
        occupation1.setName("시스템 개발");
        occupation1.setOccupation(occupationRepo.findByName("개발"));
        occupationRepo.save(occupation1);

        assertEquals(occupationRepo.findByName("개발").getOccupation().getId(), occupationRepo.findByName("IT").getId());
    }

    @Test
    public void RegisterOccupationTest3(){
        Occupation occupation = new Occupation();
        occupation.setName("백엔드");
        occupation.setOccupation(occupationRepo.findByName("개발"));

        occupationRepo.save(occupation);

        Occupation occupation1 = new Occupation();
        occupation1.setName("프론트엔드");
        occupation1.setOccupation(occupationRepo.findByName("개발"));

        occupationRepo.save(occupation1);

        assertEquals(3, occupationRepo.findByName("개발").getOccupationList().size());
    }
}
