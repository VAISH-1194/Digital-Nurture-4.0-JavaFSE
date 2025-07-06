package com.cognizant.Ex4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.Ex4.Model.Employee;
import com.cognizant.Ex4.Service.EmployeeService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}