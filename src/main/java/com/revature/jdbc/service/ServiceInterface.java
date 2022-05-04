package com.revature.jdbc.service;

import java.util.ArrayList;


import com.revature.project.model.Employee;
import com.revature.project.model.Request;

public interface ServiceInterface {
	ArrayList<Employee>getAllEmployee();

	ArrayList<Request>getAllRequest();

	Employee postEmployee(Employee m1);


}