package com.rapidken.ai.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.rapidken.ai.employee.repository.EmployeeRepository;
import com.rapidken.entity.Employee;

public class EmpController {
	@Autowired
	EmployeeRepository er;
	@PostMapping("/saveemp")
	public Employee saveEmployeeDetails(@RequestBody Employee e)
	{
		er.save(e);
		return e;
	}
	@GetMapping("/getempdata")
	public Employee getEmployeeData(@RequestParam int id)
	
	{
		Optional<Employee> em=er.findById(id);
		return em.get();
		
	}
	@GetMapping("/getalldata")
	public List<Employee> GetAllEmployeeData()
	{
		List<Employee> em=er.findAll();
		return em;
	}
	@DeleteMapping("/deletempdata")
	public String deleteEmpData(@RequestParam int id)
	{
		er.deleteById(id);
		return "Employee data deleted successfully";
	}
	@PutMapping("/updateempdata")
	public Employee updateEmpData(@RequestBody Employee e)
	{
		er.save(e);
		return e;
	}
	
	
	

}
