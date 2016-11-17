package com.ResourceManagementUI.service.types;

import java.io.Serializable;
import java.util.List;

public class UserStoryCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer categoryId;

	private String categoryName;

	private List<UserStory> userStories;

	public Integer getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<UserStory> getUserStories() {
		return userStories;
	}

	public void setUserStories(List<UserStory> userStories) {
		this.userStories = userStories;
	}

}
