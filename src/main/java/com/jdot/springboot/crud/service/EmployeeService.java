package com.jdot.springboot.crud.service;

import java.util.List;

import com.jdot.springboot.crud.entity.Employee;

public interface EmployeeService {
	
	//public Employee saveemployee(Employee employee);
	public Employee getEmployeeById(long id);
	public List<Employee>getEmployees();
	public Employee updateEmployee(Employee emp);
	public void deleteEmployee(long id);
	public Employee saveEmployee(Employee emp);
	 
}
