package com.humanresourcemanagementsystem.hrms.api.controller;

import com.humanresourcemanagementsystem.hrms.business.abstracts.JobTitleService;
import com.humanresourcemanagementsystem.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class JobTitleController {
    private JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/jobtitlegetall")
    public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }
}
