package com.example.Items.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Items.Model.Items;
import com.example.Items.Service.ItemsService;

@RestController
public class ItemsController {
	@Autowired
	ItemsService service;
	
	@PostMapping("/saveItems")
	public Items save( @RequestBody Items items) {
		return service.saveitem(items);
	}
	
	@PostMapping("/getById/{id}")
	public Optional<Items> getByid(@PathVariable String id) {
		return service.getById(id);
	}
	@GetMapping("/getAll")
	public List<Items> getAll() {
		return service.getAll();
	}
	@DeleteMapping("/deleteByid/{id}")
	public void delete(@PathVariable String id) {
		service.deleteById(id);
	}
		
		@PutMapping("/update/{id}")
		public String save(@RequestBody Items item, @PathVariable String id) {
			return service.UpdateItems(item, id);
			
	
		
	}
	
	

}
