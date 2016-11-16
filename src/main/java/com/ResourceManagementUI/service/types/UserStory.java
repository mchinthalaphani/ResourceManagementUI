package com.ResourceManagementUI.service.types;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


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
	private String userStoryStatus;
	private String userStoryOwner;
	private Date userStoryTargetDate;

	private String userStoryArtifact;

	private String userStoryCategory;
	private String userStoryNotes;

	public String getUserStoryNotes() {
		return userStoryNotes;
	}

	public void setUserStoryNotes(String userStoryNotes) {
		this.userStoryNotes = userStoryNotes;
	}
	
	public UserStory() {
		super();

	}

	public Integer getUserStoryId() {
		return userStoryId;
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

	public String getUserStoryStatus() {
		return userStoryStatus;
	}

	public void setUserStoryStatus(String userStoryStatus) {
		this.userStoryStatus = userStoryStatus;
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

	public String getUserStoryCategory() {
		return userStoryCategory;
	}

	public void setUserStoryCategory(String userStoryCategory) {
		this.userStoryCategory = userStoryCategory;
	}

}
