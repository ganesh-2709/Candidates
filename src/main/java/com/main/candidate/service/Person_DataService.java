package com.main.candidate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.candidate.Dto.Person_Dto;
import com.main.candidate.entity.PersonRepo;
import com.main.candidate.entity.Person_Data;
@Service
public class Person_DataService {
	@Autowired
	PersonRepo repo; 

	public String insertData(Person_Dto data) 
	{
		Person_Data d=new Person_Data();
		d.setPid(data.getPid());
		d.setFirstname(data.getFirstname());
		d.setLastname(data.getLastname());
		d.setAge(data.getAge());
		d.setContact(data.getContact());
		d.setLocation(data.getLocation());
		repo.save(d);
		return "data inserted successfully";
	}
	
	// get all candidates
	
	public List<Person_Data> retriveData() 
	{
		return repo.findAll();
	}
	// get single data
	public Person_Data getdetails(int pid) {
		
		Person_Data d= repo.findById(pid).get();
		 return d;
	}

	public Person_Data deletedata(int pid) {
		
		Person_Data delete= repo.deleteById(pid);
		 return delete;
	}

}
