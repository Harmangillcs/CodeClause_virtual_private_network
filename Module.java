package com.project.vpn;

public class Module {
	protected String moduleName;
	public Module(String moduleName) {
		this.moduleName=moduleName;
		
	}

	public void displayMenu() {
		System.out.println("Welcome to"+moduleName+ "module");
		System.out.println("1.View Operation:");
		System.out.println("2.Manage Staff Details:");
		System.out.println("3.Perform Technical Operation:");
		System.out.println("4.Exit from"+moduleName);
	}
	public void performOperation(int choice) {
		switch (choice) {
		case 1:
			viewOperations();
			break;
		case 2:
			manageStaffDetails();
			break;
		case 3:
			performTechnicalOperation();
			break;
		case 4:
			System.out.println("Exiting" +moduleName+"module.\n");
			break;
			default:
				System.out.println("Invalid choice,please try again!!");
		}
		
	}
	public void viewOperations() {
		System.out.println("You have Selected viewing operation of"+moduleName+ "module.\n");
	}
	public void manageStaffDetails() {
		System.out.println("You have selected managing staff details"+moduleName+ "module.\n");


}
	public void performTechnicalOperation() {
		System.out.println("You have Selected perform Technical Operation("+moduleName+ "module.\n");
	}





}
