package com.example.souk.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  

@Entity  

@Table  

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name;
	@Column  
	private String address;
	@Column  
	private String tel;





	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTel() {
		return tel;
	}



	public String getAddress() {
		return address;
	}



	public void setaddress(String address) {
		this.address = address;
	}



	public void settel(String tel) {
		this.tel = tel;
	}





}
