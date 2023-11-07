package com.sahilCURDspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahilCURDspringboot.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	


}

// JpaRepository -->  provides a set of CRUD (Create, Read, Update, Delete) methods for working with JPA entities.

