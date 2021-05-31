package com.humanresourcemanagementsystem.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_titles")
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    public JobTitle(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public JobTitle() {

    }
}
