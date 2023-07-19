package com.javaexpress.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="categories")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="cname")
	private String name;
	
	@CreationTimestamp
	private Date createdTime;
	
	@UpdateTimestamp
	private Date updateTime;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/*
	 * public Set<Product> getProducts() { return products; }
	 * 
	 * public void setProducts(Set<Product> products) { this.products = products; }
	 */
	
	/*
	 * @OneToMany(mappedBy = "category")
	 * 
	 * @JsonIgnore private Set<Product> products=new HashSet<>();
	 */
	
	
	  @Override
	  public String toString()
	  { return "Category [id=" + id + ", name="
	  + name + ", createdTime=" + createdTime + ", updateTime=" + updateTime
	  /*", products=" + products + "]"*/; }

}
