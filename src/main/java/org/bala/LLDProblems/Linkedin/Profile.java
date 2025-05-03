package org.bala.LLDProblems.Linkedin;

public class Profile {
    private String userId;
    private String profilePic;
    private String headLine;
    private String summary;
    private String[] experience;
    private String[] education;

    public Profile(String userId, String profilePic, String headLine, String summary, String[] experience, String[] education) {
        this.userId = userId;
        this.profilePic = profilePic;
        this.headLine = headLine;
        this.summary = summary;
        this.experience = experience;
        this.education = education;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String[] getExperience() {
        return experience;
    }

    public void setExperience(String[] experience) {
        this.experience = experience;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }
}
