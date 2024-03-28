package com.main.candidate.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person_Data, Integer>
{
	public Person_Data  deleteById(int pid);
}
