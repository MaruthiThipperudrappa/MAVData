package com.javaexpress.repositories;

import com.javaexpress.models.Category;
import com.javaexpress.services.CategoryServiceimpl;
import com.javaexpress.services.ICategory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)

@SpringBootTest
public class CategoryRepositoryTest {

    @Mock
    private CategoryRepository categoryRepository;
    @InjectMocks
    CategoryServiceimpl categoryServiceimpl;

    @Test
    public void dos()
    {
        Category expected = new Category(1,"Ramesh",new Date(),new Date());
        Category category=Category.builder()
                .name("Ramesh")
                .createdTime(new Date())
                .updateTime(new Date()).build();
        Mockito.when(categoryRepository.save(category)).thenReturn(expected);
        Category actualResult=categoryRepository.save(category);
        System.out.println(actualResult);
        Assertions.assertThat(actualResult.getName()).isEqualTo("Ramesh");
    }

    @Test
    public void fetchCategory(){
        Category expected = new Category(1,"Ramesh",new Date(),new Date());
        Category category=Category.builder()
                .name("Ramesh")
                .createdTime(new Date())
                .updateTime(new Date()).build();
        Mockito.when(categoryRepository.findById(1)).thenReturn(Optional.of(expected));
        Optional<Category> actualResult=categoryRepository.findById(1);
        System.out.println(actualResult);
        Assertions.assertThat(actualResult.get()).isEqualTo(expected);
    }
}
