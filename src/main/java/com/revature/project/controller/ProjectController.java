package com.revature.project.controller;


import java.util.ArrayList;

import com.revature.project.model.Request;
import com.revature.jdbc.service.Service;
import com.revature.jdbc.service.ServiceInterface;
import com.revature.project.model.Employee;

import io.javalin.http.Handler;


public class ProjectController {
	
	static ServiceInterface service =  new Service();
	
	public static Handler getAllEmployee =ctx ->{
		ArrayList<Employee> empList = service.getAllEmployee();
		ctx.json(empList);

	};
	public static Handler getAllRequest =ctx ->{
		ArrayList<Request> rmpList = service.getAllRequest();
		ctx.json(rmpList);
	};
	public static Handler postEmployee = ctx ->{
		Employee m1 = ctx.bodyAsClass(Employee.class);
		service.postEmployee(m1);
};
}