package com.humanresourcemanagementsystem.hrms.business.abstracts;

import com.humanresourcemanagementsystem.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
