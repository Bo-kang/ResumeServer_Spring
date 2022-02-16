package com.paper.resume.service;

import com.paper.resume.domain.Occupation;

import java.util.List;

public interface OccupationService {
    Occupation GetOccupation(Occupation occupation);
    List<Occupation> GetOccupationList();

}
