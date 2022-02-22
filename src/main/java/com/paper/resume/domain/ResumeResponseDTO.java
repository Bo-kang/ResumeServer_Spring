package com.paper.resume.domain;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class ResumeResponseDTO {
    private Integer resumeID;
    private List<SkillStack> skillStackList;
    private List<Job> jobList;

    public ResumeResponseDTO(Resume resume){
        resumeID = resume.getId();
        skillStackList = resume.getUsedSkill();
        jobList = resume.getJobList();

    }
}
