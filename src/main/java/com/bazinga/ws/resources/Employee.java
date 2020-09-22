package com.bazinga.ws.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bazinga.ws.models.EmployeeInfo;
import com.bazinga.ws.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class Employee {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeInfo get(@PathVariable("id") int id) {
		return employeeService.get(id);
	}
	
}
