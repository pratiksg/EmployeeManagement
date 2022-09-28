package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Employee;
import com.capgemini.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee getEmployeeByid(int id) {
	
		return ((ArrayList<Employee>) employeeRepository.findByid(id)).get(id);
	}

	public void saveOrUpdate(com.capgemini.model.Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void delete(int id) {
	
		employeeRepository.deleteById(id);
	}

	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
		
		}

}
