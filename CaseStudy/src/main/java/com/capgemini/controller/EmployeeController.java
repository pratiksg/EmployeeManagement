package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Employee;
import com.capgemini.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employee")
	private List <Employee>getAllEmployee(){
		
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	private Employee getEmployee(@PathVariable("id")int id) {
		return employeeService.getEmployeeByid(id);
		
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id")int id) {
		employeeService.delete(id);
	}
	
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) {
		
		employeeService.saveOrUpdate(employee);
		return employee.getId();
		
	}

}
