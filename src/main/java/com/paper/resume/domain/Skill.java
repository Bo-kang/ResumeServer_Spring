package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Skill {
    @Id @GeneratedValue
    private Integer skillId;

    private String skillName;


    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Resume resume;

}
