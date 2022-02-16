package com.paper.resume.service;

import com.paper.resume.domain.Occupation;
import com.paper.resume.persistence.OccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationServiceImpl implements OccupationService {

    private final OccupationRepository occupationRepo;

    @Autowired
    public OccupationServiceImpl(OccupationRepository occupationRepo){
        this.occupationRepo = occupationRepo;
    }

    @Override
    public Occupation GetOccupation(Occupation occupation) {
        return occupationRepo.findById(occupation.getId()).get();
    }

    @Override
    public List<Occupation> GetOccupationList() {
        return (List<Occupation>)occupationRepo.findAll();
    }

}
