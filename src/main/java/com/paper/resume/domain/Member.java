package com.paper.resume.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Member {
    @Id @GeneratedValue
    @Column(updatable = false)
    private Integer seq;

    @Column(unique = true, name = "MEMBER_ID")
    private String id;

    private String password;
    private String email;

    @Column(updatable = false, columnDefinition = "date default sysdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private String role;

    @ColumnDefault("true")
    private boolean enable;
}
