package com.main.candidate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.candidate.Dto.Person_Dto;
import com.main.candidate.entity.Person_Data;
import com.main.candidate.service.Person_DataService;

@RestController
public class Person_DataController {
	
	@Autowired
	private Person_DataService service;
	
	//configure  data using Json
	
	@PostMapping("/login")
	public String insertData(@RequestBody Person_Dto data)
	{		
		return service.insertData(data);
	}
	
	//retrive all details of all candidates
	@GetMapping("/retrive")
	public List<Person_Data> retrive()
	{
		return service.retriveData();
	}
	
	//retrive all details of person
	@GetMapping("/person/{pid}")
	public Person_Data getdetails(@PathVariable int pid )
	{
		return service.getdetails(pid);
	}
	
	//delete the data from database
	@DeleteMapping("/remove/{pid}")
	public Person_Data deletedata(@PathVariable int pid )
	{
		return service.deletedata(pid);
	}
	
}
