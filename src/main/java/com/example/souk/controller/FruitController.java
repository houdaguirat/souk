package com.example.souk.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.souk.model.Fruit;
import com.example.souk.service.FruitService;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class FruitController {

	//autowire the FruitService class  
	@Autowired  
	FruitService fs;  

	//creating a get mapping that retrieves all the Fruit detail from the database   
	@GetMapping("/Fruit")
	private List<Fruit> getAllFruits()   
	{  
		return fs.getAllFruits();  
	}  

	//creating a get mapping that retrieves the detail of a specific Fruit  
	@GetMapping("/Fruit/{id}")  
	private Fruit getFruit(@PathVariable("id") int id)   
	{  
		return fs.getFruitById(id);  
	}  

	//creating a delete mapping that deletes a specified Fruit  
	@DeleteMapping("/Fruit/{id}")  
	private void deleteFruit(@PathVariable("id") int id)   
	{  
		fs.delete(id);  
	} 

	//create new Fruit
	@PostMapping("/Fruit")  
	private int saveFruit(@RequestBody Fruit f)   
	{  
		fs.saveOrUpdate(f);  
		return f.getId();  
	} 

	//creating put mapping that updates the Fruit detail
	@PutMapping("/Fruit")  
	private Fruit update(@RequestBody  Fruit f)   
	{  
		fs.saveOrUpdate(f);  
		return f;  
	}  
}


