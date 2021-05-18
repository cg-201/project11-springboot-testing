package com.capgemini.service;

import com.capgemini.entities.Employee;

public interface IEmployeeService {

	public Employee findById(int id);
	public Employee createEmployee(Employee employee);
}
