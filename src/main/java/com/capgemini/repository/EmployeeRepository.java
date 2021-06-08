package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// NOT BY DEFAULT
	public Employee findByUserNameAndPassword(String userName, String password);
}
