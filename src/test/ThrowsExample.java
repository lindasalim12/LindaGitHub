package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample obj = new ThrowsExample();
		try {
		
		obj.eligibility(17);
		}catch (ArithmeticException e) 
		{
			System.out.println("Exception Handled");
		}
	}


	public void eligibility(int age)throws ArithmeticException// indicates the method has a throw exception when it is called 
	{
	
	if(age<18) 
		
		throw new ArithmeticException("Not eligible for voting");
	else
		System.out.println("Eligible for voting");
	}
}

