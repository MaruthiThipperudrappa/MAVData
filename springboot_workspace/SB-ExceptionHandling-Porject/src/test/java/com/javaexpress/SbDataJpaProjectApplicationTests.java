package com.javaexpress;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.javaexpress.entity.Product;
import com.javaexpress.repositories.ProductRepository;
import com.javaexpress.services.ProductService;


@SpringBootTest
class SbDataJpaProjectApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */
	
	@Autowired
	private ProductService productService;
	
	@MockBean
	private ProductRepository productRepository;

	public void fetchProductInformation() {
		when(productRepository.findAll()).thenReturn((Iterable<Product>) (new Product(1, "mi", 9000.00, "desc"))).toString();
		assertEquals(1, productService.fetchAllProducts());
	}
}
