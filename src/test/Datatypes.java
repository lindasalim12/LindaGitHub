package test;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
int num1=50;
int num2=11;

int sum =num1+num2;
int product= num1*num2;
int division= num1/num2;
float div= (float)num1/num2;

System.out.println("Hello World");
System.out.println("sum= " +sum);
System.out.println("product= " +product);
System.out.println("division= " +div);
String name= "Rahul";
System.out.println("Hello " + name);
System.out.println("length: " +name.length());
System.out.println("Uppercase: " +name.toUpperCase());


Scanner scanner = new Scanner(System.in);
System.out.println("Enter the name");
String Name= scanner.next();
System.out.println("NAME =" + Name);
int myArray [] = {1,2,3,4,5};
System.out.println(" THE SECOND NUMBER="+ myArray[1]);
	}

}
