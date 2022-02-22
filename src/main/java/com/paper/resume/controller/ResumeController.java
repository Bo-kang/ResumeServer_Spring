package com.paper.resume.controller;


import com.paper.resume.domain.Resume;
import com.paper.resume.domain.ResumeResponseDTO;
import com.paper.resume.service.ResumeServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
public class ResumeController {
    private final ResumeServiceImpl resumeService;

    @GetMapping("/resumeList")
    @Transactional
    public ArrayList<ResumeResponseDTO> GetResumeList(){
        ArrayList<ResumeResponseDTO> resumeList = resumeService.GetResumeList();

        return resumeList;
    }

}
