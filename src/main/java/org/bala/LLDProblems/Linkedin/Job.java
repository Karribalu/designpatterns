package org.bala.LLDProblems.Linkedin;

public class Job {
    private String jobId;
    private String title;
    private String description;
    private String requirements;
    private String location;

    public Job(String id, String title, String description, String requirements, String location) {
        this.jobId = id;
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.location = location;
    }

    public String getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRequirements() {
        return requirements;
    }

    public String getLocation() {
        return location;
    }
}

