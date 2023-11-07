package com.sahilCURDspringboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;                 ///////////////////////
import org.springframework.web.bind.annotation.PostMapping;      
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sahilCURDspringboot.entities.Employee;
import com.sahilCURDspringboot.repository.EmployeeRepository;
import com.sahilCURDspringboot.services.Emp_Service;

                                                   // identification for the package     It is combination of @Controller + @ResponseBody
@RestController                                                           //@Controller         // used to handle the http session
public class MainController {
	
	@Autowired
	Emp_Service emp_Service ;
	
	
	@PostMapping("/employees")
	public Employee createEmp(@RequestBody Employee employee)              
	{
		return emp_Service.saveDetails(employee);
	}
	
	
	@PostMapping("/employeeList")
	public List<Employee> empDetails(@RequestBody List<Employee> employees)
	{
		return emp_Service.saveListDetail(employees);
	}
	
	
	@GetMapping("/employeesFetchList")
	public List<Employee> getEmp()
	{
		return emp_Service.getAllEmployee();
	}
	
	
	@GetMapping("/employeeFetch/{empid}")
	public Employee getEmpById(@PathVariable int empid)
	{
		return emp_Service.getSingleEmp(empid);
	}
	
	
	@PutMapping("/employe")
	public Employee updateEmployeId(@RequestBody Employee employee)
		{
			return emp_Service.updateDetails(employee);
		}

	@DeleteMapping("/employeess/{empid}")
	public String deleteById(@PathVariable int empid)
	{
		return emp_Service.deleteby(empid);
	}
	
	
}
	
	
	
	
	



