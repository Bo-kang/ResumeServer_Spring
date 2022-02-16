package com.paper.resume.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString(exclude = { "job", "parentOccupation" })
@Entity
public class Occupation {
    @Id @GeneratedValue
    private Integer id;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne
    private Occupation parentOccupation;

    @OneToMany(mappedBy = "parentOccupation", fetch = FetchType.EAGER)
    private List<Occupation> occupationList = new ArrayList<>();

    @OneToMany(mappedBy = "occupation")
    private List<Job> job = new ArrayList<>();

    @Column(unique = true)
    private String name;

}
