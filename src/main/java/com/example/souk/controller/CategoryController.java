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

import com.example.souk.model.Category;
import com.example.souk.service.CategoryService;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class CategoryController {

	//autowire the CategoryService class  
	@Autowired  
	CategoryService cs;  

	//creating a get mapping that retrieves all the Category detail from the database   
	@GetMapping("/Category")
	private List<Category> getAllCategorys()   
	{  
		return cs.getAllCategorys();  
	}  

	//creating a get mapping that retrieves the detail of a specific Category  
	@GetMapping("/Category/{id}")  
	private Category getCategory(@PathVariable("id") int id)   
	{  
		return cs.getCategoryById(id);  
	}  

	//creating a delete mapping that deletes a specified Category  
	@DeleteMapping("/Category/{id}")  
	private void deleteCategory(@PathVariable("id") int id)   
	{  
		cs.deleteById(id);  
	} 

	//create new Category
	@PostMapping("/Category")  
	private int saveCategory(@RequestBody Category c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the Category detail
	@PutMapping("/Category")  
	private Category update(@RequestBody  Category c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}
