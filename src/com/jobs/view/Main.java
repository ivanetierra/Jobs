package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 100.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 100.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "Volunteers don't get paid");
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 100.0);
		
		
		controller.payAllEmployeers();

		//controller.getAllEmployees();
		
		String allEmployees = controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}
