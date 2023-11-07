package com.sahilCURDspringboot.services;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.sahilCURDspringboot.entities.Employee;
import com.sahilCURDspringboot.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class Emp_Service {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveDetails(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public List<Employee>  saveListDetail(List<Employee> employees)
	{
		return employeeRepository.saveAll(employees);
	}
	
	public Employee getSingleEmp(int empid)
	{
		return employeeRepository.findById(empid).orElse(null);
	}

	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	
	
	
	
	public Employee updateDetails(Employee employee)
	{
		Employee updateEmp = employeeRepository.findById(employee.getEmpid()).orElse(null);
				
				{
					if(updateEmp!=null)
					{
						updateEmp.setEmpname(employee.getEmpname());
						updateEmp.setEmpadress(employee.getEmpadress());
						
						employeeRepository.save(updateEmp);
						return updateEmp;
					}
					
					return null;
				}
	}
	
	
	public String deleteby(int empid)
	{
		employeeRepository.deleteById(empid);;
		return "deleted"+empid;
	}
	
}
