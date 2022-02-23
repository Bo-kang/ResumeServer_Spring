package com.paper.resume.controller;


import com.paper.resume.domain.ResumeListResponseDTO;
import com.paper.resume.domain.ResumeResponseDTO;
import com.paper.resume.service.ResumeServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
public class ResumeController {
    private final ResumeServiceImpl resumeService;

    @GetMapping("/resumeList")
    public ArrayList<ResumeListResponseDTO> getResumeList(){
        ArrayList<ResumeListResponseDTO> resumeList = resumeService.getResumeList();

        return resumeList;
    }

    @GetMapping("/resume")
    public ResumeResponseDTO getResume(@RequestParam Integer resumeId){
        ResumeResponseDTO res = resumeService.getResume(resumeId);
        System.out.println(res.toString());
        return res;
    }

}
