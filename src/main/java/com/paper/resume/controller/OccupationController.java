package com.paper.resume.controller;

import com.paper.resume.domain.Occupation;
import com.paper.resume.service.OccupationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OccupationController {
    private final OccupationServiceImpl occupationService;

    @GetMapping("/occupationList")
    public List<Occupation> getOccupationList(){
        return occupationService.getOccupationList();
    }
}
