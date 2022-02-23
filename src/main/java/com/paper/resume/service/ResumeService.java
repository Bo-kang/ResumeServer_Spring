package com.paper.resume.service;

import com.paper.resume.domain.*;

import java.util.List;

public interface ResumeService {
    void registerResume(Member member, SkillStack skillStack, Job job);
    List<ResumeListResponseDTO> getResumeList();
    ResumeResponseDTO getResume(Integer resumeId);
}
