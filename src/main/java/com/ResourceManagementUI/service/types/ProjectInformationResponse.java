package com.ResourceManagementUI.service.types;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ProjectInformationResponse implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer projectId;
	private String projectName;
	private String projectDescription;
	private String projectClientName;
	private Date projectStartDate;
	private Date projectEndDate;
	private String projectStatus;
	private List<UserStory> userstories;
	private List<ProjectSprint> projectSprints;
	
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectClientName() {
		return projectClientName;
	}
	public void setProjectClientName(String projectClientName) {
		this.projectClientName = projectClientName;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public List<UserStory> getUserstories() {
		return userstories;
	}
	public void setUserstories(List<UserStory> userstories) {
		this.userstories = userstories;
	}
	public List<ProjectSprint> getProjectSprints() {
		return projectSprints;
	}
	public void setProjectSprints(List<ProjectSprint> projectSprints) {
		this.projectSprints = projectSprints;
	}
	

}
