package com.example.ambarish.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ambarish.departmentservice.entity.Department;
import com.example.ambarish.departmentservice.service.DepartmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
	     
	    String jsonString = mapper.writeValueAsString(department);
	    
		System.out.print("ambarish form controller"+jsonString);
		log.info("inside save department method of department controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		
		log.info("inside find department by id method of department controller");
		return departmentService.findDepartmentById(departmentId);
	}
}
