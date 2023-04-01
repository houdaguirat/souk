package com.example.souk.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.souk.model.Client;



  
public interface ClientRepository extends CrudRepository<Client, Integer>  
{  
}  
