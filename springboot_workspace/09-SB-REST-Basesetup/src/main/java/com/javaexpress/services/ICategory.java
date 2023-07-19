package com.javaexpress.services;
import com.javaexpress.models.Category;

import java.util.Map;

public interface ICategory {

	public Category createCategory(Category inputcategory);

	public void delete(Integer id);

	public Category fetchCategory(Integer id);

	public Iterable<Category> fetchAllCategories();
	
	public Category updateCategory(Integer id,Category category);

	public Category updateexistingCategory(Integer id, Map<String, Object> category);

/*
	public Category upda(Integer id,Category category,Map<String, Object> category1);

*/

}
