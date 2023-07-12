package com.payroll.main.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payroll.main.model.Employee;


	@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long> {
			
			

		}




