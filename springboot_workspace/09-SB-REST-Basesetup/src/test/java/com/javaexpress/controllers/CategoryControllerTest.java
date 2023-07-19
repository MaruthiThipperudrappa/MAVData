package com.javaexpress.controllers;
import com.javaexpress.models.Category;
import com.javaexpress.repositories.CategoryRepository;
import com.javaexpress.services.ICategory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CategoryControllerTest {
    @Mock
    CategoryRepository categoryRepository;
    @MockBean
    ICategory iCategory;
    @Autowired
    CategoryController categoryController;
    protected  MockMvc mockMvc;

    @BeforeEach
    void setup()
    {
        MockitoAnnotations.initMocks(this);
        categoryController = new  CategoryController(iCategory,categoryRepository);
        mockMvc= MockMvcBuilders.standaloneSetup(categoryController).build();
    }
    @Test
    public void fetchAllCategories() {
        Iterable<Category> actual = Arrays.asList(
                new Category(1, "Maruthi", new Date(), new Date()),
                new Category(2, "Maruthi", new Date(), new Date()));

        Mockito.when(categoryController.fetchAllCategories()).thenReturn(actual);
        Iterable<Category> list = categoryController.fetchAllCategories();
        Assertions.assertThat(list).isEqualTo(actual);
        System.out.println("Categoryd controller "+categoryController.toString());
       }

    @Test
    public void fetchCategories(){
        Optional<Category> actual = Optional.of(new Category(1, "Maruti", new Date(), new Date()));
        Mockito.when(categoryController.fetchCategory(1)).thenReturn(actual.get());
        Optional<Category> list = Optional.of(categoryController.fetchCategory(1));
        Assertions.assertThat(list).isEqualTo(actual);
        System.out.println("fetchCategories()" +categoryController.fetchCategory(1));
    }
    @Test
    public void updateCategory(){
        Optional<Category> act1=Optional.of(new Category(1,"maruthi",new Date(),new Date()));
        Optional<Category> act=Optional.of(new Category(1,"maruthi",new Date(),new Date()));
        Mockito.when(categoryController.updateCategory(1, Category.builder().build())).thenReturn(act.get());
        Optional<Category> li=Optional.of(categoryController.updateCategory(1, Category.builder().build()));
        Assertions.assertThat(li).isEqualTo(act1);
        System.out.println("update categories()" +categoryController.updateCategory(1, Category.builder().build()));
        System.out.println(li);
        System.out.println(act);
    }
    @Test
    public void  delete() throws Exception{
        String uri="/category/1";
        String str=MockMvcRequestBuilders.delete(uri).toString();
        System.out.println(str);
        MvcResult mvcResult=this.mockMvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        System.out.println(mvcResult);
        int status=mvcResult.getResponse().getStatus();
        assertEquals(202,status);
        String content=mvcResult.getResponse().getContentAsString();
        assertEquals(content,"");
    }
}

