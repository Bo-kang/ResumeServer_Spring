package com.paper.resume.controller;


import com.paper.resume.domain.Resume;
import com.paper.resume.service.ResumeServiceImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@RequiredArgsConstructor
@Controller
public class ResumeController {
    private final ResumeServiceImpl resumeService;

    @GetMapping("/resumeList")
    public void GetResumeList(Model model){
        ArrayList<Resume> resumeList = resumeService.GetResumeList();

        model.addAllAttributes(resumeList);

    }

}
