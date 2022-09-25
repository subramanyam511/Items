package com.example.Items.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author subra
 *
 */
@Entity


public class Items {
	@Id
	private String Id;
	private String Name;
	private String Category;
	private Integer price;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
	
	
	

}
