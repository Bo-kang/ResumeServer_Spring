package com.paper.resume.domain;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

@ToString//(exclude = "skillMap")
@Getter
public class ResumeListResponseDTO {
    private Integer resumeID;
    private Integer careerYear;
    private Integer careerMonth;
    private Map<Skill, Integer> skillMap;

    public ResumeListResponseDTO(Resume resume){
        resumeID = resume.getId();
        careerYear = 0;
        careerMonth = 0;
        skillMap = new HashMap<Skill, Integer>() ;
        List<Job> jobList = resume.getJobList();
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        for(Job iter : jobList){
            cal1.setTime(iter.getHiredDate());
            if(iter.getFiredDate() == null)
                cal2.setTime(new Date());
            else
                cal2.setTime(iter.getFiredDate());

            careerYear += (cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR));
            careerMonth += (cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH));
        }

        List<SkillStack> skillStackList = resume.getUsedSkill();
        for(SkillStack iter : skillStackList ){
            skillMap.put(iter.getSkill(), iter.getUsedYear());
        }

    }
}
