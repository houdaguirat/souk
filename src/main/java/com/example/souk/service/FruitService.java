package com.example.souk.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.souk.model.Fruit;
import com.example.souk.repository.FruitRepository;

//defining the business logic  
@Service 

public class FruitService {

	@Autowired  
	FruitRepository fR;  
	
	//getting all fruits record by using the method findaAll() of CrudRepository  
	public List<Fruit> getAllFruits()   
	{  
		List<Fruit> fruits = new ArrayList<Fruit>();  
		fR.findAll().forEach(f -> fruits.add(f));  
		return fruits;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Fruit getFruitById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fruit f)   
	{  
		fR.save(f);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fR.deleteById(id)
;  
	} 

}
