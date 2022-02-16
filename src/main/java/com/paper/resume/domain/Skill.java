package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
@Entity
public class Skill {

    public Skill(){
        skillName = "";
    }

    @Id @GeneratedValue
    private Integer skillId;

    private String skillName;

    @OneToMany(mappedBy = "skill", fetch = FetchType.EAGER)
    private List<SkillStack> skillStack = new ArrayList<>();

}
