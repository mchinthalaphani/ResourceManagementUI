/* User Info Response
 * Application: ResourceManagement
 * Created by: Sayali Khodke
 * Date: 8/25/2016
 * Last Updated:8/26/2016
*/
package com.ResourceManagementUI.service.types;

import java.io.Serializable;

public class UserInfoResponse implements Serializable {
	private Integer user_id;
	private String firstName;
	private String lastName;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
