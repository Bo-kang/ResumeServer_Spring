package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Job {
    @Id @GeneratedValue
    private Integer id;

    @ManyToOne
    private Occupation occupation;

    @ManyToOne
    private Resume resume;

    private String companyName;
    @Column(nullable = false)
    private Date hiredDate;
    private Date firedDate;


    private String description;
}
