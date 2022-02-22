package com.paper.resume.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(exclude = {"skillStack"})
@Entity
public class Skill {

    public Skill(){
        skillName = "";
    }

    @Id @GeneratedValue
    private Integer skillId;

    private String skillName;

    @JsonIgnore
    @OneToMany(mappedBy = "skill", fetch = FetchType.EAGER)
    private List<SkillStack> skillStack = new ArrayList<>();

}
