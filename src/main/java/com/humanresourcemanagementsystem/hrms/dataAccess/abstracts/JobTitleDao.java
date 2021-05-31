package com.humanresourcemanagementsystem.hrms.dataAccess.abstracts;

import com.humanresourcemanagementsystem.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
