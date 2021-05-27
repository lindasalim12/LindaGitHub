package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b= 0;
try {
int sum= a/b;// No errors shown at compile time since syntax and logic is right, but at runtime divide by 0 exception is found
System.out.println("This line will not be executed");//This line will not be executed. It will stop executing once exception is found in the try block and then moves to catch block
}catch(ArithmeticException e) {
System.out.println("Arithmetic Exception is handled");
	}
catch (Exception e){
System.out.println("Exception is handled");
}finally {
	System.out.println("Try catch is successfully executed");// This is executed even when there is no exception 
}
System.out.println("Hello");
int myArray [] = {1,2,3,4,5};
try {
System.out.println(" THE SECOND NUMBER="+ myArray[6]);
}catch (ArrayIndexOutOfBoundsException e) {
System.out.println("AOB exception handled");// When more that array index is executed
}
	}
}
