package mycall;
import java.util.Scanner;

import addprog.Add;
import subprog.Sub;
import multiprog.Multi;
import divisionprog.Division;
//import extractprog.LowerCase;
//import extractprog.UpperCase;
public class Call {

	
	public static void main(String [] args) {
//		Add.add(3, 5); //static
//		Add a = new Add(); //non static
//		a.add(2, 4, 6);
//		
//		Sub b = new Sub();
//		b.sub(5, 4);
//		
//		Multi c = new Multi();
//		c.multiply(2,4,6);
//		
//	    Division.Div(10,2);
//		
//	    LowerCase e = new LowerCase();
//	    e.getUpper('a');
//	    e.isLowerVowel('i');
//	    
//	    UpperCase f = new UpperCase();
//	    f.getLower('A');
//	    f.isUpperVowel('O');
		
		Scanner s = new Scanner(System.in);
		boolean flag =true;
		while(flag) {
		
	    System.out.println("WELCOME TO CALCULATOR");
		System.out.println("ENTER 1 FOR ADD");
		System.out.println("ENTER 2 FOR SUB");
		System.out.println("ENTER 3 FOR MULTIPLY");
		System.out.println("ENTER 4 FOR DIVIDE");
		System.out.println("ENTER 5 EXIT");
		
		int opt = s.nextInt();
		switch(opt)
		{
		case 1:
		{
			System.out.println("welcome to Addition");
			System.out.println("enter 1 for 2 number add");
			System.out.println("enter 2 for 3 number addition");
			System.out.println("enter 3 go back");
			int y = s.nextInt();
			if(y == 1)
			{
				System.out.println("enter the 1st number");
				int num1 = s.nextInt();
				System.out.println("enter the 2nd number");
				int num2 = s.nextInt();
				Add.add(num1, num2);
				
			}
			
			else if (y == 2) {
				System.out.println("enter the 1st number");
				int num1 = s.nextInt();
				System.out.println("enter the 2nd number");
				int num2 = s.nextInt();
				System.out.println("enter the 3rd number");
				int num3 = s.nextInt();
				Add ref = new Add();
				ref.add(num1, num2, num3);
			}
			
			break;
		}
			
			case 2:
			{
				System.out.println("welcome to Subtraction");
				System.out.println("enter 1 for 2 number Subtract");
				System.out.println("enter 2 go back");
				int y = s.nextInt();
				if(y == 1)
				{
					System.out.println("enter the 1st number");
					int num1 = s.nextInt();
					System.out.println("enter the 2nd number");
					int num2 = s.nextInt();
					Sub b = new Sub();
					b.sub(num1, num2);
				}
				
				break;
				
			}
			
			case 3:
			{
				System.out.println("welcome to Multiply");
				System.out.println("enter 1 for 3 number Multiply");
				System.out.println("enter 2 go back");
				int y = s.nextInt();
				if(y == 1)
				{
					System.out.println("enter the 1st number");
					int num1 = s.nextInt();
					System.out.println("enter the 2nd number");
					int num2 = s.nextInt();
					System.out.println("enter the 3rd number");
					int num3 = s.nextInt();
					Multi c = new Multi();
           			c.multiply(num1,num2,num3);
				}
				
				break;
				
			}
			case 4:
			{
				System.out.println("welcome to Division");
				System.out.println("enter 1 for 2 number Divide");
				System.out.println("enter 2 Go back");
				int y = s.nextInt();
				if(y == 1)
				{
					System.out.println("enter the 1st number");
					int num1 = s.nextInt();
					System.out.println("enter the 2nd number");
					int num2 = s.nextInt();
					Division.Div(num1 , num2);
				}
				
				break;
				
					
				
			}
			case 5:{
				flag=false;
				break ;
			}
			
			default: {
				System.out.println("invalid statement");
				
			}
			
			
			
		}	
			
			
		
		
		}
		
		}
		
	    
}

