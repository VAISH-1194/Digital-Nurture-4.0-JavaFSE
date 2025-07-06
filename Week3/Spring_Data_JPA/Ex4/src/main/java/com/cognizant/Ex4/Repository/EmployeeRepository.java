package com.cognizant.Ex4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.Ex4.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
    
}