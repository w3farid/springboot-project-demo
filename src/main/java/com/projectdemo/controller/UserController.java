package com.projectdemo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.projectdemo.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class UserController implements CommonController<User> {
	
	@Override
	public ModelAndView index() {
		return null;
	}
	@GetMapping("user")
	@Override
	public ModelAndView create() {
		return new ModelAndView("user/create");
	}

	@Override
	public String delete(String id) {
		return null;
	}

	@Override
	public ModelAndView edit(String id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public User getOne(String id) {
		return null;
	}
    @PostMapping("/create-user")
	@Override
	public User store(@RequestBody User entity) {
		
		System.out.println(entity.getUsername());
		System.out.println("::::::::::::::::::::::::");

		return entity;
	}

	@Override
	public String update(HttpServletRequest request) {
		return null;
	}

}
