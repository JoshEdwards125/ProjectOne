package com.revature.project.dao;

import io.javalin.http.Handler;




import io.javalin.http.staticfiles.Location;

import java.sql.*;
import java.util.ArrayList;
import com.revature.project.model.Employee;
import com.revature.project.model.Request;
import com.revature.jdbc.ConnectionUtils;

public class EmpDao implements EmpInterface{


		public ArrayList<Employee> getAllEmployee(){
		    //get connection from the connectionUtils class
			Connection conn = ConnectionUtils.createConnection();
		    PreparedStatement pstmt;
		    ResultSet rs;
		    
		    //create a prepared Statement and execute for * client and fetch in result set
		    String selectAllEmployee = "select * from ManUser";
		    ArrayList<Employee> empList= new ArrayList<Employee>();
	        Employee e;
		    
			try{
		    	 pstmt= conn.prepareStatement(selectAllEmployee);
			        rs = pstmt.executeQuery();

		        //create an Arraylist
		      

		        while(rs.next()){
		            int id = rs.getInt("reimbursement_id");
		            String f_name = rs.getString("firstname");  
		            String email = rs.getString("email");
		            String amount = rs.getString("amount");
		            String reason = rs.getString("reason");
		            String status = rs.getString("status");	  
		            e = new Employee(id, f_name, email, amount, reason, status);
		            empList.add(e);
		        } 
		            rs.close();
			        pstmt.close();
			       

			    }catch (SQLException f){
			        f.printStackTrace();
			        
			    }return empList;
		    };
		    
		    public ArrayList<Request> getAllRequest(){
			    //get connection from the connectionUtils class
				Connection conn = ConnectionUtils.createConnection();
			    PreparedStatement pstmt;
			    ResultSet rs;
			    
			    //create a prepared Statement and execute for * client and fetch in result set
			    String selectAllRequest = "select * from EMP";
			    ArrayList<Request> rmpList= new ArrayList<Request>();
		        Request r;
			    
				try{
			    	 pstmt= conn.prepareStatement(selectAllRequest);
				        rs = pstmt.executeQuery();

			        //create an Arraylist
			      

			        while(rs.next()){
			            int id = rs.getInt("R_id");
			            int amount = rs.getInt("amount");
			            String reason = rs.getString("reason");
			            String status = rs.getString("status");	  
			            r = new Request(id, amount, reason, status);
			            rmpList.add(r);
			        } 
			            rs.close();
				        pstmt.close();
				       

				    }catch (SQLException f){
				        f.printStackTrace();
				        
				    }return rmpList;
			    };
			    
			    public Employee postEmployee(Employee m1) {
					// TODO Auto-generated method stub
					PreparedStatement pstmt;
					Connection conn = ConnectionUtils.createConnection();
					
					try {
						pstmt = conn.prepareStatement("insert into ManUser(id,email,f_name,amount,reason,status) values(default,?,?,?,?,'Pending')");
						pstmt.setString(1, m1.getEmail());
						pstmt.setString(2,m1.getF_name());
						pstmt.setString(3,m1.getAmount());
						pstmt.setString(4, m1.getReason());
		
						//pstmt.setString(4, e1.getStatus());
						
						pstmt.execute();
						pstmt.close();
						
					} catch (SQLException e) 
					{
						e.printStackTrace();
				}
					return null;
		    
		};

}