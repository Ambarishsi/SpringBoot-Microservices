package com.example.ambarish.departmentservice.entity;

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
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	
	@JsonProperty(value="departmentId")
	public Long getDepartmentId() {
		return departmentId;
	}
	@JsonProperty(value="departmentId")
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@JsonProperty(value="departmentName")
	public String getDepartmentName() {
		return departmentName;
	}
	
	@JsonProperty(value="departmentName")
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@JsonProperty(value="departmentAddress")
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	
	@JsonProperty(value="departmentAddress")
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	
	@JsonProperty(value="departmentCode")
	public String getDepartmentCode() {
		return departmentCode;
	}
	@JsonProperty(value="departmentCode")
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
}
