package com.vietanh.springboot.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.vietanh.springboot.admin.model.CategoryDTO;
import com.vietanh.springboot.admin.service.CategoryService;


public abstract class AbstractController {
	@Autowired
	private CategoryService categoryService;

	public String getCategoryByID(Model model, String viewName) {
		List<CategoryDTO> categoryDTOs = categoryService.getAllCategory();
		model.addAttribute("listCategory", categoryDTOs);
		return viewName;
	}
}
