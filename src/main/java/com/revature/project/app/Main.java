package com.revature.project.app;




import com.revature.project.controller.ProjectController;


import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
	
	public static void main(String[] args) {
	        
		Javalin app = Javalin.create(ctx->{ctx.addStaticFiles("Web", Location.CLASSPATH);}).start(8080);
		//Javalin app = Javalin.create(ctx -> {ctx.enableCorsForAllOrigins();ctx.addStaticFiles("web",Location.CLASSPATH);}).start();
		
		app.get("/Em", ProjectController.getAllEmployee);			
	
		app.get("/Emp", ProjectController.getAllRequest);
		
		app.post("/Employee", ProjectController.postEmployee);
		
	}	
}
