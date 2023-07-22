package com.project.vpn;

import java.util.Scanner;




		public class VirtualPrivateNetwork {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		      Scanner scanner=new Scanner(System.in);
		      AdministrationModule adminModule=new AdministrationModule();
		      MarketingModule marketingModule=new MarketingModule();
		      TrainingModule trainingModule=new TrainingModule();
		       
		      
		      while(true) {
		    	  System.out.println("Select a module:");
		    	  System.out.println("1.Administration");
		    	  System.out.println("2.Marketing");
		    	  System.out.println("3.Training");
		    	  System.out.println("4.exit");
		   int moduleChoice=scanner.nextInt();
		   
		   switch(moduleChoice) {
		   case 1:
	       runModule(adminModule, scanner);
			   break;
		   case 2:
			   runModule(marketingModule,scanner);
			   break;
		   case 3:
			   runModule(trainingModule,scanner);
			   break;
		   case 4:
			   System.out.println("Exiting VPN project!!");
			   scanner.close();
			   System.exit(0);
			   default:
				   System.out.println("Invalid choice,please try again!!!");
			  
			   
		   }
		      }
		      
			}
			public static void runModule(Module module,Scanner scanner) {
				while(true) {
					module.displayMenu();
					int choice=scanner.nextInt();
					if(choice==4) {
						break;
					}
					module.performOperation(choice);

		}
			}
		}

	
