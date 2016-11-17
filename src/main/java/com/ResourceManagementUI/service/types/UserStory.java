package com.ResourceManagementUI.service.types;

import java.io.Serializable;
import java.util.Date;

public class UserStory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userStoryId;

	private String userStoryDescription;

	private String estimatedTime;

	private String actualTimeSpent;

	private String remainingTime;

	private String userStoryOwner;

	private Date userStoryTargetDate;

	private String userStoryArtifact;

	private String userStoryNotes;

	private UserStoryType userStoryType;

	private Project projects;

	private ProjectSprint projectSprints;

	private UserStoryCategory userStoryCategories;

	private UserStoryStatus userStoryStatus;

	public Integer getUserStoryId() {
		return userStoryId;
	}

	public void setUserStoryId(Integer userStoryId) {
		this.userStoryId = userStoryId;
	}

	public String getUserStoryDescription() {
		return userStoryDescription;
	}

	public void setUserStoryDescription(String userStoryDescription) {
		this.userStoryDescription = userStoryDescription;
	}

	public String getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getActualTimeSpent() {
		return actualTimeSpent;
	}

	public void setActualTimeSpent(String actualTimeSpent) {
		this.actualTimeSpent = actualTimeSpent;
	}

	public String getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		this.remainingTime = remainingTime;
	}

	public String getUserStoryOwner() {
		return userStoryOwner;
	}

	public void setUserStoryOwner(String userStoryOwner) {
		this.userStoryOwner = userStoryOwner;
	}

	public Date getUserStoryTargetDate() {
		return userStoryTargetDate;
	}

	public void setUserStoryTargetDate(Date userStoryTargetDate) {
		this.userStoryTargetDate = userStoryTargetDate;
	}

	public String getUserStoryArtifact() {
		return userStoryArtifact;
	}

	public void setUserStoryArtifact(String userStoryArtifact) {
		this.userStoryArtifact = userStoryArtifact;
	}

	public String getUserStoryNotes() {
		return userStoryNotes;
	}

	public void setUserStoryNotes(String userStoryNotes) {
		this.userStoryNotes = userStoryNotes;
	}

	public UserStoryType getUserStoryType() {
		return userStoryType;
	}

	public void setUserStoryType(UserStoryType userStoryType) {
		this.userStoryType = userStoryType;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public ProjectSprint getProjectSprints() {
		return projectSprints;
	}

	public void setProjectSprints(ProjectSprint projectSprints) {
		this.projectSprints = projectSprints;
	}

	public UserStoryCategory getUserStoryCategories() {
		return userStoryCategories;
	}

	public void setUserStoryCategories(UserStoryCategory userStoryCategories) {
		this.userStoryCategories = userStoryCategories;
	}

	public UserStoryStatus getUserStoryStatus() {
		return userStoryStatus;
	}

	public void setUserStoryStatus(UserStoryStatus userStoryStatus) {
		this.userStoryStatus = userStoryStatus;
	}

}
