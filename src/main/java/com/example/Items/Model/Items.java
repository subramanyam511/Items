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
	private String id;
	private String name;
	private String category;
	private String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
