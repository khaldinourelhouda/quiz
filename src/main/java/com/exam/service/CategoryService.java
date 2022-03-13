package com.exam.service;

import java.util.Set;

import com.exam.model.Category;

public interface CategoryService {
	
	public Category addCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public Set<Category> getCategories();
	
	public Category getCategory(Long categoryId);
	
	public void  deleteCategorie(Long categorieId);

}
