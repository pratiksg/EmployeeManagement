package com.capgemini.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	ArrayList<Employee> findByid(int id);


	void deleteById(int id);

	ArrayList<Employee> findAll();

}
