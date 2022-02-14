package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "SkillStack")
public class SkillStack {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "RESUME_ID")
    private Resume resume;

    @ManyToOne
    @JoinColumn(name = "SKILL_ID")
    private Skill skill;

    private Integer usedYear;

}