package com.paper.resume.service;

import com.paper.resume.domain.*;

import java.util.List;

public interface ResumeService {
    void RegisterResume(Member member, SkillStack skillStack, Job job);
    List<ResumeResponseDTO> GetResumeList();
    Resume GetResume(Resume resume);
}
