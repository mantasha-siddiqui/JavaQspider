package task;

import java.util.Scanner;

public class OlaApp {

	public static void main (String [] args) {
		Ola ola = new Ola();
		System.out.println("welcome to OLA");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the option 1 for user 2 for driver");
		int opt = s.nextInt();
		
		if(opt == 1)
		{
			User u = new User();
			System.out.println("enter the choice 1 for Auto");
			System.out.println("enter the choice 2 for Bike");
			System.out.println("enter the choice 3 for Cab");
			int o = s.nextInt();
			switch(o) {
			case 1:
			{
				System.out.println("you have selected auto");	
				ola.addAuto(new Auto());
				System.out.println("this is auto details");
				ola.a.printdetails();
				System.out.println("wait for auto it is coming");
				
			
				}
			
			break; 
			case 2:
			{
				System.out.println("you have selected bike");	
				ola.addBike(new Bike());
				System.out.println("this is bike details");
				ola.b.pd();
				System.out.println("wait for bike it is coming");
				
			}
				
			
			break;
			case 3:
			{
				System.out.println("you have selected cab");	
				ola.addCab(new Cab());
				System.out.println("this is cab details");
				ola.c.printdetail();
				System.out.println("wait for cab it is coming");
			}
			break;
			
			default :
			{
				System.out.println("invalid");
			}
		}}
		else if(opt == 2) {
			Driver d = new Driver();
			System.out.println("hii" +" "+ d.name+ " we  are connecting you with the user");
			d.driver();
			
		}else {
			System.out.println("invalid");
		}
		
    
		
	}
	}

