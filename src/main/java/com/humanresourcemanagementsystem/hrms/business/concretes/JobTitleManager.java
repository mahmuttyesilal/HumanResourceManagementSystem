package com.humanresourcemanagementsystem.hrms.business.concretes;

import com.humanresourcemanagementsystem.hrms.business.abstracts.JobTitleService;
import com.humanresourcemanagementsystem.hrms.dataAccess.abstracts.JobTitleDao;
import com.humanresourcemanagementsystem.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }
}
