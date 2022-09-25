 package com.example.Items.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Items.Model.Items;
@Repository

public interface ItemsRepo extends JpaRepository<Items, String>  {

}
