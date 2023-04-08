package com.example.souk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.souk.model.Category;
import com.example.souk.repository.CategoryRepository;

//defining the business logic  
@Service 

public class CategoryService {

	@Autowired  
	CategoryRepository cR;  
	
	//getting all Categorys record by using the method findaAll() of CrudRepository  
	public List<Category> getAllCategorys()   
	{  
		List<Category> Categorys = new ArrayList<Category>();  
		cR.findAll().forEach(c -> Categorys.add(c));  
		return Categorys;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Category getCategoryById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Category c)   
	{  
		cR.save(c);  
	} 
