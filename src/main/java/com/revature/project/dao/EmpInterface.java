package com.revature.project.dao;

import java.util.ArrayList;



import com.revature.project.model.Employee;
import com.revature.project.model.Request;

public interface EmpInterface {
	
	ArrayList<Employee>getAllEmployee();
	
	ArrayList<Request>getAllRequest();

}
