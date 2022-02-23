package com.paper.resume.service;

import com.paper.resume.domain.Occupation;

import java.util.List;

public interface OccupationService {
    Occupation getOccupation(Occupation occupation);
    List<Occupation> getOccupationList();

}
