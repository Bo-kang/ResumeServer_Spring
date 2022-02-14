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
public class Occupation {
    @Id @GeneratedValue
    private Integer id;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne
    private Occupation occupation;

    @OneToMany(mappedBy = "occupation", fetch = FetchType.EAGER)
    private List<Occupation> OccupationList = new ArrayList<Occupation>();

    @OneToMany(mappedBy = "occupation")
    private List<Job> job = new ArrayList<Job>();

    private String name;

}
