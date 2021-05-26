package com.example.ambarish.user.VO;

import com.example.ambarish.user.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private User user;
	private Department department;
	
	
	@JsonProperty(value="user")
	public User getUser() {
		return user;
	}
	@JsonProperty(value="user")
	public void setUser(User user) {
		this.user = user;
	}
	
	@JsonProperty(value="department")
	public Department getDepartment() {
		return department;
	}
	@JsonProperty(value="department")
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
