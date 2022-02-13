package com.paper.resume.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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

    private String name;

}
