package com.example.souk.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.souk.model.Fruit;



  
public interface FruitRepository extends CrudRepository<Fruit, Integer>  
{  
}  