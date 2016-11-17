package com.ResourceManagementUI.service.types;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProjectSprint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer sprintId;

	private String sprintNumber;

	private String sprintOwner;

	private Date startDate;

	private Date endDate;

	public Integer getSprintId() {
		return sprintId;
	}

	public void setSprintId(Integer sprintId) {
		this.sprintId = sprintId;
	}

	public String getSprintNumber() {
		return sprintNumber;
	}

	public void setSprintNumber(String sprintNumber) {
		this.sprintNumber = sprintNumber;
	}

	public String getSprintOwner() {
		return sprintOwner;
	}

	public void setSprintOwner(String sprintOwner) {
		this.sprintOwner = sprintOwner;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public SprintStatus getSprintStatus() {
		return sprintStatus;
	}

	public void setSprintStatus(SprintStatus sprintStatus) {
		this.sprintStatus = sprintStatus;
	}

	public Project getProjects() {
		return projects;
	}

	public void setProjects(Project projects) {
		this.projects = projects;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

	private SprintStatus sprintStatus;

	private Project projects;

	private List<UserStory> userStories;

}
