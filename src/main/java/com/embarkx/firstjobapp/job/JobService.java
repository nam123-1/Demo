package com.embarkx.firstjobapp.job;

import java.util.List;

public interface JobService {
    List<Job> findALL();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deletedJobById(Long id);

    boolean updateJob(Long id, Job updateJob);
}
