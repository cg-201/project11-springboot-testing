package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee findById(int id) {
		Employee e = employeeRepository.findById(id).get();
		return e;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		
		return employee;
	}

}
