package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString(exclude = {"usedSkill", "jobList"})
@Getter
@Setter
@Entity
public class Resume {
    @Id @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_SEQ")
    private Member member;

    @OneToMany(mappedBy = "resume")
    private List<SkillStack> usedSkill = new ArrayList<SkillStack>();

    @OneToMany(mappedBy = "resume")
    private List<Job> jobList = new ArrayList<Job>();
}