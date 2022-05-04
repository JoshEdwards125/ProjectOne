package com.revature.jdbc.service;

import com.revature.project.dao.EmpDao;
import com.revature.project.model.Employee;
import com.revature.project.model.Request;

import java.util.ArrayList;

public class Service implements ServiceInterface {
	EmpDao dao = new EmpDao();
	
	@Override
	public ArrayList<Employee> getAllEmployee(){
		return dao.getAllEmployee();
	}
	
	@Override
	public ArrayList<Request> getAllRequest(){
		return dao.getAllRequest();
	}
	
	@Override
	public Employee postEmployee(Employee m1) {
		// TODO Auto-generated method stub
		return dao.postEmployee(m1);
	}
}
