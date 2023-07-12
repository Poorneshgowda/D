package com.payroll.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payroll.main.Repository.EmployeeRepository;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	

		
		@Autowired
		public EmployeeRepository employeeRepo;
		
	}


