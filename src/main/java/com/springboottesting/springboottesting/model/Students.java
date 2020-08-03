package com.springboottesting.springboottesting.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String companyAppliedTo;
    private Date appliedDate;

    public Students(String fname,String lname,String company) {
        this.firstName = fname;
        this.lastName = lname;
        this.companyAppliedTo = company;
        long millis=System.currentTimeMillis();
        appliedDate=new java.sql.Date(millis);
    }

    public Students() {

    }
}
