package com.paper.resume.service;

import com.paper.resume.domain.*;
import com.paper.resume.persistence.JobRepository;
import com.paper.resume.persistence.ResumeRepository;
import com.paper.resume.persistence.SkillStackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public ArrayList<ResumeResponseDTO> GetResumeList() {
        List<Resume> resumeList = (List<Resume>)resumeRepo.findAll();
        ArrayList<ResumeResponseDTO> resList = new ArrayList<ResumeResponseDTO>();
        for(Resume iter : resumeList){

            resList.add(new ResumeResponseDTO(iter));
        }
        return resList;
    }

    @Override
    public Resume GetResume(Resume resume) {

        return resumeRepo.findById(resume.getId()).get();
    }
}
