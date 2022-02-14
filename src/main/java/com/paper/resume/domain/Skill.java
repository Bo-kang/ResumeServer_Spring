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
    @Id @GeneratedValue
    private Integer skillId;

    private String skillName;

    @OneToMany(mappedBy = "skill")
    private List<SkillStack> resume = new ArrayList<SkillStack>();

}
