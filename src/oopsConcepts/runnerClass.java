package oopsConcepts;

public class runnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ClassA Empl= new ClassA(1000, "Sujith", "xyz");
ClassA Emp2= new ClassA();
/*Empl.Name= "Sujith";
Empl.Salary= 1000;
Empl.OrgName= "abc";*/

/*Empl.Display();
ClassB Obj1 = new ClassB();
ClassC Obj2 = new ClassC();
Obj1.Name = "Raj";
Obj1.Salary=1000;
Obj1.OrgName = "PQR";
Obj1.Display();
Obj1.show();
Obj2.run();*/
		MethodOverloading Obj3 = new MethodOverloading();
		Obj3.add(1, 2);
		Obj3.add(1.1, 2.3);
		MethodOverrideChild Obj4 = new MethodOverrideChild();
		MethodOverrideParent Obj5 = new MethodOverrideParent();
		Obj5.display();
		Obj4.display();
		AbstractChild Obj7 = new AbstractChild();
		Obj7.method2();
		Obj7.method1();
		InterfaceChild Obj8 = new InterfaceChild();
		Obj8.method1();
		EncapsulationExample EncEg = new EncapsulationExample();
		EncEg.setSalary(1000);
		System.out.println("salary is:" + EncEg.getSalary());
	}

}
