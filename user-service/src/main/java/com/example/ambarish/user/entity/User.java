package com.example.ambarish.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long departmentId;
	
	@JsonProperty(value="firstName")
	public String getFirstName() {
		return firstName;
	}
	@JsonProperty(value="firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@JsonProperty(value="lastName")
	public String getLastName() {
		return lastName;
	}
	@JsonProperty(value="lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@JsonProperty(value="email")
	public String getEmail() {
		return email;
	}
	@JsonProperty(value="email")
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonProperty(value="departmentId")
	public Long getDepartmentId() {
		return departmentId;
	}
	@JsonProperty(value="departmentId")
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	

}
