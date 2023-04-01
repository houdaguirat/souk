package com.example.souk.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.souk.model.Client;
import com.example.souk.repository.ClientRepository;

//defining the business logic  
@Service 

public class ClientService {

	@Autowired  
	ClientRepository cR;  
	
	//getting all Clients record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClients()   
	{  
		List<Client> Clients = new ArrayList<Client>();  
		cR.findAll().forEach(c -> Clients.add(c));  
		return Clients;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Client c)   
	{  
		cR.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id)
;  
	} 

}


