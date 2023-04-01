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

import com.example.souk.model.Client;
import com.example.souk.service.ClientService;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class ClientController {

	//autowire the ClientService class  
	@Autowired  
	ClientService cs;  

	//creating a get mapping that retrieves all the Client detail from the database   
	@GetMapping("/Client")
	private List<Client> getAllClients()   
	{  
		return cs.getAllClients();  
	}  

	//creating a get mapping that retrieves the detail of a specific Client  
	@GetMapping("/Client/{id}")  
	private Client getClient(@PathVariable("id") int id)   
	{  
		return cs.getClientById(id);  
	}  

	//creating a delete mapping that deletes a specified Client  
	@DeleteMapping("/Client/{id}")  
	private void deleteClient(@PathVariable("id") int id)   
	{  
		cs.delete(id);  
	} 

	//create new Client
	@PostMapping("/Client")  
	private int saveClient(@RequestBody Client c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the Client detail
	@PutMapping("/Client")  
	private Client update(@RequestBody  Client c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}


