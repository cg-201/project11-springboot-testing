package com.capgemini.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.capgemini.entities.Employee;
import com.capgemini.service.IEmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	// LEARNING 1 :: DUMMY OBJECT :: MOCK OBJECT
	@MockBean
	private IEmployeeService employeeService;

	@Test
	void findEmployeeTest() throws Exception {
		
		Employee e = new Employee();
		e.setUserName("rahul");
		e.setEmail("rahul@gmail.com");
		
		// LEARNING 2
		// providding the implemenation of findById method.
		// mocking the findById method on MockObject employeeService
		Mockito.when(employeeService.findById(Mockito.anyInt())).thenReturn(e);
		
		mockMvc.perform(get("/api/employee/1"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("rahul"));
	}
	
	
	@Test
	void createEmployeeTest() throws Exception {
		
		Employee e = new Employee();
		e.setUserName("rahul");
		e.setEmail("rahul@gmail.com");
		
		// LEARNING 2
		// providding the implemenation of createEmployee method.
		// mocking the findById method on MockObject employeeService
		Mockito.when(employeeService.createEmployee(Mockito.any())).thenReturn(e);
		
		
		mockMvc.perform(post("/api/employee/")
						.contentType(MediaType.APPLICATION_JSON)
						.content(new ObjectMapper().writeValueAsString(e))
						)
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").value("rahul"));
	}
	

}
