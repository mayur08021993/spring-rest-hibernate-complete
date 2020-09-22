package com.bazinga.ws.services;

import org.springframework.stereotype.Service;

import com.bazinga.ws.models.EmployeeInfo;

@Service
public class EmployeeService {
	
	public EmployeeInfo get(int id) {
		return new EmployeeInfo(id, "Mayur Hatte", 50000);
	}
}
