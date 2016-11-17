package com.ResourceManagementUI.service.types;

import java.io.Serializable;
import java.util.List;

public class UserStoryStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer statusId;

	private UserStoryStatusType statusName;

	private List<UserStory> userStories;

	public Integer getStatusId() {
		return statusId;
	}

	public UserStoryStatusType getStatusName() {
		return statusName;
	}

	public void setStatusName(UserStoryStatusType statusName) {
		this.statusName = statusName;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

}
