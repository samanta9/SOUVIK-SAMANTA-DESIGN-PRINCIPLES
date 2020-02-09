package epam.com.calculator_application;


import java.util.*;

class calculator
{
	Scanner sc=new Scanner(System.in);
	int a,b,sum=0,sub=0,mul=1;
	float  div;
	void add()
	{
		System.out.println("\n enter  two numbers to add:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sum=a+b;
		
		System.out.println("\n the addition of " + a + " and " + b + " is : " + sum);
	}
	
	void subtract()
	{
		System.out.println("\n enter  two numbers to subtract :");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sub=a-b;
		
		System.out.println("\n the subtraction of " + a + " and " + b + " is : " + sub);
		
		
	}
	
	void multiply()
	{
		System.out.println("\n enter  two numbers to multiply :");
		a=sc.nextInt();
		b=sc.nextInt();
		
		mul=a*b;
		
		System.out.println("\n the multiply  of " + a + " and " + b + " is : " + mul);
	}
	
	void divide()
	{
		System.out.println("\n enter  two numbers to divide:");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		
		div=a/b;

		System.out.printf("\n the division of %.0f and %.0f is : %.2f",a,b,div);
		
	}
	
	
}

public class App 
{
	public static void main( String[] args )
	{
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		calculator c=new calculator();
		
		while(true)
		{
		    System.out.println("\n 1. ADDITON  "+"\n 2. SUBTRACTION " +"\n 3. MULTIPLICATION " +"\n 4. DIVISION "   +"\n 5. EXIT");
		
		    System.out.println("\n ENTER YOUR CHOICE :");
		
		      choice=sc.nextInt();
		     
			  switch(choice)
		  {
			
			case 1: c.add();
			        break;
			
			case 2: c.subtract();
			        break;
			
			case 3: c.multiply();
			         break;
			
			case 4: c.divide();
			        break;
					
			case 5: break;
			
			default: System.out.println("\n WRONG CHOICE!!! PLEASE RE-ENTER YOUR CHOICE ");
			         break;
					 
		
		  }
		  
		  if(choice==5)
			  
		    {  System.out.println("!!!! THANK YOU !!!!");
  		       break;
		    
			}
		
		}
		
		
		
		
		
	}
	
	
	
}


