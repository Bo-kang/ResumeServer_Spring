package com.paper.resume.service;

import com.paper.resume.domain.*;
import com.paper.resume.persistence.JobRepository;
import com.paper.resume.persistence.ResumeRepository;
import com.paper.resume.persistence.SkillStackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public ArrayList<ResumeListResponseDTO> GetResumeList() {
        List<Resume> resumeList = (List<Resume>)resumeRepo.findAll();
        ArrayList<ResumeListResponseDTO> resList = new ArrayList<ResumeListResponseDTO>();
        for(Resume iter : resumeList){
            resList.add(new ResumeListResponseDTO(iter));
        }
        return resList;
    }

    @Override
    @Transactional
    public ResumeResponseDTO GetResume(Integer resumeId) {

        return new ResumeResponseDTO(resumeRepo.findById(resumeId).get());
    }
}
