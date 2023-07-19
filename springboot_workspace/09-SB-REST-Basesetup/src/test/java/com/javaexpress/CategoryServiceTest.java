package com.javaexpress;

import static org.mockito.ArgumentMatchers.any;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import com.javaexpress.models.Category;
import com.javaexpress.repositories.CategoryRepository;
import com.javaexpress.services.CategoryServiceimpl;

@SpringBootTest
public class CategoryServiceTest {

	@InjectMocks
	CategoryServiceimpl categoryServiceimpl;
	@Mock
	CategoryRepository categoryRepository;

	@Test
	public void createCategory() {

		Category category = new Category();
		category.setName("mariachi");
		category.setCreatedTime(new Date());

		Mockito.when(categoryRepository.save(Mockito.any())).thenReturn(category);
		Category result = categoryServiceimpl.createCategory(category);
		Mockito.verify(categoryRepository).save(Mockito.any());
		Assertions.assertNotNull(result);
		Assertions.assertEquals("mariachi", result.getName());
	}

		@Test
		public void updateCategory(){
			Category category = new Category();
			category.setId(1);
			category.setName("mariachi");
			category.setUpdateTime(new Date());
			category.setCreatedTime(new Date());

			Mockito.when(categoryRepository.save(any())).thenReturn(category);
			Mockito.when(categoryRepository.findById(1)).thenReturn(Optional.of(category));
			 Mockito.when(categoryServiceimpl.updateCategory(1,category)).thenReturn(category);
			Category result=categoryServiceimpl.updateCategory(1,category);
			Mockito.verify(categoryRepository).save(Mockito.any());
			Assertions.assertNotNull(result);
			Assertions.assertEquals("mariachi",result.getName());
	}

	@Test
	public void deleteCategory() {
		Category category = new Category();
		category.setName("mariachi");
		category.setCreatedTime(new Date());
		category.setId(1);

		Mockito.when(categoryRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(category));
		Mockito.doNothing().when(categoryRepository).delete(category);
		categoryServiceimpl.delete(1);
		Mockito.verify(categoryRepository).delete(category);
	}

	@Test
	public void deleteCategorynotpresent() {
		Category category = new Category();
		category.setName("mariachi");
		category.setCreatedTime(new Date());
		category.setId(1);

		Mockito.when(categoryRepository.findById(Mockito.anyInt())).thenReturn(Optional.ofNullable(null));
		Mockito.doNothing().when(categoryRepository).delete(category);
		Assertions.assertThrows(RuntimeException.class, () -> categoryServiceimpl.delete(1));
	}

	@Test
	public void fetchAllCategories() {

		Category category = new Category();
		category.setName("mariachi");
		category.setCreatedTime(new Date());
		ArrayList<Category> records = new ArrayList<Category>();

		Mockito.when(categoryRepository.findAll()).thenReturn((records));
		Iterable<Category> result = categoryServiceimpl.fetchAllCategories();
		Mockito.verify(categoryRepository).findAll();
		Assertions.assertNotNull(result);
		Mockito.verify(categoryRepository).findAll();
		System.out.println(result);

	}

}
