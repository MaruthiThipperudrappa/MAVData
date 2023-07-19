package com.javaexpress.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.javaexpress.entity.Product;
import com.javaexpress.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product fetchProductInformation(Integer id) throws Exception {
		return productRepository.findById(id)
		.orElseThrow(()->new Exception("Product id is not found"));
	}
	
	public void deleteProduct(Integer id) throws Exception {
		Product product=fetchProductInformation(id);
		if(product!=null) {
			productRepository.delete(product);		
		}
	}
	
	public Iterable<Product> fetchAllProducts(){
		return productRepository.findAll();
	}
	public void updateProduct(Integer id,Product product) throws Exception {
		Product product2=fetchProductInformation(id);
		if(product2!=null){
			product2.setProductName(product2.getProductName());
			product2.setProductPrice(product2.getProductPrice());
			product2.setProductDescription(product2.getProductDescription());
			productRepository.save(product2);
		}	
	}
}