package com.paper.resume.service;

import com.paper.resume.domain.Job;
import com.paper.resume.domain.Member;
import com.paper.resume.domain.Resume;
import com.paper.resume.domain.SkillStack;
import com.paper.resume.persistence.JobRepository;
import com.paper.resume.persistence.ResumeRepository;
import com.paper.resume.persistence.SkillStackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ResumeServiceImpl implements ResumeService {

    private final SkillStackRepository skillStackRepo;
    private final ResumeRepository resumeRepo;
    private final JobRepository jobRepo;

    @Override
    public void RegisterResume(Member member, SkillStack skillStack, Job job) {
        Resume resume = new Resume();
        resume.setMember(member);
        Resume savedResume = resumeRepo.save(resume);

        skillStack.setResume(savedResume);
        job.setResume(savedResume);

        skillStackRepo.save(skillStack);
        jobRepo.save(job);
    }

    @Override
    public List<Resume> GetResumeList() {
        return null;
    }

    @Override
    public Resume GetResume(Resume resume) {
        return resumeRepo.findById(resume.getId()).get();
    }
}
