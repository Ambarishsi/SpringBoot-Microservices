package com.example.ambarish.departmentservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ambarish.departmentservice.entity.Department;
import com.example.ambarish.departmentservice.repository.DepartmentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public Department saveDepartment(Department department) throws JsonProcessingException {
		
		log.info("inside save department method of department service here");
		ObjectMapper mapper = new ObjectMapper();
	     
	    String jsonString = mapper.writeValueAsString(department);
	    
		System.out.print("ambarish"+jsonString);
		
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		
		log.info("inside findDepartmentById method of department service");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
