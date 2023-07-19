package com.javaexpress.controllers;
import com.javaexpress.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import com.javaexpress.models.Category;
import com.javaexpress.services.ICategory;

import java.util.Map;

@RestController
//@RequiredArgsConstructor
public class CategoryController {
	@Autowired
	private ICategory iCategory;
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryController(ICategory category, CategoryRepository categoryRepository) {
		this.iCategory = category;
		this.categoryRepository = categoryRepository;
	}

	@PostMapping("/category/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Category createCategory(@RequestBody Category inputcategory) {
		System.out.println(inputcategory);
		return iCategory.createCategory(inputcategory);
	}

	@GetMapping("/category/all")
	public Iterable<Category> fetchAllCategories() {
		return iCategory.fetchAllCategories();
	}

	@GetMapping("/category/{id}")
	public Category fetchCategory(@PathVariable("id") Integer categoryId) {
		return iCategory.fetchCategory(categoryId);
	}

	@DeleteMapping("/category/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteCategory(@PathVariable("id") Integer categoryId) {
		iCategory.delete(categoryId);
	}

	@PutMapping("/category/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Category updateCategory(@PathVariable("id") Integer id, @RequestBody Category inputcategory) {
		return iCategory.updateCategory(id, inputcategory);
	}

	@PatchMapping("/categorypatch/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Category updateexistingCategory(@PathVariable("id") Integer id, @RequestBody Map<String,Object> category){
return iCategory.updateexistingCategory(id, category);
	}

	/*@PatchMapping("/category1234/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Category updateexistingCategory1(@PathVariable("id") Integer id, Category category,@RequestBody Map<String,Object> category1) {
		return iCategory.upda(id, category, category1);
	}*/
}