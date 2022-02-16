package com.paper.resume.service;

import com.paper.resume.domain.Job;
import com.paper.resume.domain.Member;
import com.paper.resume.domain.Resume;
import com.paper.resume.domain.SkillStack;

import java.util.List;

public interface ResumeService {
    void RegisterResume(Member member, SkillStack skillStack, Job job);
    List<Resume> GetResumeList();
    Resume GetResume(Resume resume);
}
