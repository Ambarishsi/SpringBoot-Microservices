package com.example.ambarish.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ambarish.user.VO.Department;
import com.example.ambarish.user.VO.ResponseTemplateVO;
import com.example.ambarish.user.entity.User;
import com.example.ambarish.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public User saveUser(User user) {
		
		log.info("inside saveUser method of user service");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
	
		log.info("inside getUserWithDepartment method of user service");
		
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		
		
		Department department = 
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), 
						Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
		
	}
}
