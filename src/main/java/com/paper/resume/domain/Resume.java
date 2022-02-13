package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
public class Resume {
    @Id @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "skill",  fetch = FetchType.EAGER)
    private List<Skill> usedSkill;

    @OneToMany(mappedBy = "occupation", fetch = FetchType.EAGER)
    private List<Occupation> findingPosition;
}