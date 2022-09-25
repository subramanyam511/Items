package com.example.Items.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Items.Model.Items;
import com.example.Items.Repo.ItemsRepo;


@Service
public class ItemsService {

	@Autowired
	ItemsRepo repo;
	public Items saveitem(Items item) {
		return repo.save(item);
		
		
	}

	public List<Items> getAll() {
		return repo.findAll();
		
	}
	
	public Optional<Items> getById(String id) {
		return repo.findById(id);
	}
	
	
     public void deleteById(String id) {
		
		 repo.deleteById(id);
	}
     public String UpdateItems(Items item, String id) {
    	 Optional<Items> it=getById(id);
    	 if (it.isPresent()) {
			repo.save(item);
			return"Updated done";
			
		}
	
               else {
	          return id+" not found";
	
	
}
}
	
	
	
}
