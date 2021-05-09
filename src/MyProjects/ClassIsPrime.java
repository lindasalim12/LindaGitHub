package MyProjects;

import java.util.Scanner;

public class ClassIsPrime {
	
	public int number;
	public boolean isprime = true;
	
	// To read the number
	public void YourNumber()
	{
		System.out.println("Enter your number:");
		Scanner scanner= new Scanner(System.in);
		  number= scanner.nextInt();
	}
	
	//checking prime or not
	public void ClasscheckPrime()
	{
	
		if (number==0||number==1)
		{
		System.out.println(number+ " is neither prime nor composite");
		
		return;
		}
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)	
			{  
			isprime=false;
			}
		}
		
		if(isprime==false)
		{
			System.out.println(number +" is not prime");
		} 
		else
		{
			System.out.println(number+ " is prime");
		}
		
	}
	
}
