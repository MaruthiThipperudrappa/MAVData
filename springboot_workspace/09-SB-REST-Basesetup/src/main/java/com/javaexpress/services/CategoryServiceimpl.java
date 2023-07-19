package com.javaexpress.services;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaexpress.models.Category;
import com.javaexpress.repositories.CategoryRepository;
import org.springframework.util.ReflectionUtils;

@Service
public class CategoryServiceimpl implements ICategory{

	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category inputcategory) {
		// TODO Auto-generated method stub
		
		System.out.println(inputcategory.toString());
		return categoryRepository.save(inputcategory);
	}

	@Override
	public void delete(Integer id) {
		Category dbcategory=fetchCategory(id);
		categoryRepository.delete(dbcategory);
		}

	@Override
	public Category fetchCategory(Integer id) {
		Optional<Category> optional =categoryRepository.findById(id);
		System.out.println("fetch Category "+optional.toString());
		if(optional.isPresent()) {			
		Category category=optional.get();
		System.out.println(category);
			return category;
		}else {
			throw new RuntimeException("Category not found exception");
	}
	}
	@Override
	public Iterable<Category> fetchAllCategories() {
		return categoryRepository.findAll();
	}

	
	@Override
	public Category updateCategory(Integer id, Category category){
		
		Category dbcategory=fetchCategory(id);
		if(dbcategory!=null) {
			dbcategory.setName(category.getName());
			dbcategory.setCreatedTime(category.getCreatedTime());
			dbcategory.setUpdateTime(category.getUpdateTime());
			categoryRepository.save(dbcategory);
		}			
		return dbcategory;

	}

	@Override
	public Category updateexistingCategory(Integer id, Map<String, Object> category) {
		Optional<Category> existingaccount = categoryRepository.findById(id);
		if (existingaccount.isPresent()) {
			category.forEach((key,value)->{
				Field field = ReflectionUtils.findField(Category.class, key);
				field.setAccessible(true);
				ReflectionUtils.setField(field,existingaccount.get(),value);
			}
			);
			}
		return categoryRepository.save(existingaccount.get());
	}

	/*
	@Override
	public Category upda(Integer id,Category category,Map<String, Object> category1) {
		Optional<Category> exists=categoryRepository.findById(id);
		if(exists.isPresent()*//*||category.getCreatedTime()!=null*//*){
			category1.forEach((key,value)->{
				Field field = ReflectionUtils.findField(Category.class, key);
				field.setAccessible(true);
				*//*if(category.getCreatedTime()!=null){
					category.setCreatedTime(category.getCreatedTime());
					categoryRepository.save(category);
				}*//*
				*//*category1.entrySet().stream().filter();*//*
				ReflectionUtils.setField(field,exists.get(),value);
			}
			);
		}
		return categoryRepository.save(exists.get());
	}*/
}