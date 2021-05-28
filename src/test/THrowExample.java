package test;

public class THrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int age=15;
		
		if(age<18) {
			
			throw new ArithmeticException("Not eligible for voting");//when we want to add an exception
		}else
			System.out.println("Eligible for voting");
		}catch(ArithmeticException e)
		{System.out.println("Exception is handled");}
	}

}
