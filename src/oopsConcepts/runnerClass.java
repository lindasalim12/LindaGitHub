package oopsConcepts;

public class runnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA Empl= new ClassA(1000, "Sujith", "xyz");
ClassA Emp2= new ClassA();
/*Empl.Name= "Sujith";
Empl.Salary= 1000;
Empl.OrgName= "abc";*/

Empl.Display();
ClassB Obj1 = new ClassB();
ClassC Obj2 = new ClassC();
Obj1.Name = "Raj";
Obj1.Salary=1000;
Obj1.OrgName = "PQR";
Obj1.Display();
Obj1.show();
Obj2.run();
	}

}
