package org.bala.LLDProblems.Linkedin;

import java.time.LocalDateTime;

public class JobApplication {
    private String jobId;
    private String applicantId;
    private LocalDateTime applicationTime;

    public JobApplication(String jobId, String applicantId) {
        this.jobId = jobId;
        this.applicantId = applicantId;
        this.applicationTime = LocalDateTime.now();
    }

    public String getJobId() {
        return jobId;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public LocalDateTime getApplicationTime() {
        return applicationTime;
    }
}
