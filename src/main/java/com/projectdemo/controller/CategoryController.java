package com.projectdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.projectdemo.model.Category;
import com.projectdemo.model.User;

@RestController
public class CategoryController implements CommonController<Category> {

	@Override
	public ModelAndView index() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/category")
	@Override
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("category/create");
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User store(Category entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
