package com.example.ambarish.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ambarish.user.VO.ResponseTemplateVO;
import com.example.ambarish.user.entity.User;
import com.example.ambarish.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("inside saveUser method of user controller");
		return userService.saveUser(user);
	}
	
	
	@GetMapping("{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		
		log.info("inside getUserWithDepartment method of user controller");
		return userService.getUserWithDepartment(userId);
	}
	
}
