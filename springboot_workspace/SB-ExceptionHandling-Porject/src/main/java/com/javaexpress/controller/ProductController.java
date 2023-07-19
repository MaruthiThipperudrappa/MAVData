package com.javaexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javaexpress.entity.Product;
import com.javaexpress.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/hello")
		public String sayHello(){
		return "Welocme to java home";
	}
	
	@PostMapping("/createproduct")
	public ResponseEntity<Product> saveProductInfo(@RequestBody Product product){
		Product dbproduct= productService.saveProduct(product);		
		return new ResponseEntity<Product>(dbproduct,HttpStatus.CREATED );
	}

	@GetMapping("/allproduct")
	public Iterable<Product> fetchAllProducts() {
		return productService.fetchAllProducts();
	}
	
	@DeleteMapping("/deleteproduct")
	public void deleteproduct(@PathVariable Integer id) throws Exception {
		productService.deleteProduct(id);
	}
	
	@PutMapping("/updateproduct")
		public void updateproductinfo(Integer id,@PathVariable Product product) throws Exception {
		productService.updateProduct(id,product);
			
		}
	}

