package com.javaexpress.repositories;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//import com.javaexpress.entity.Product;
import com.javaexpress.entity.Product;

@EnableJpaRepositories
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
