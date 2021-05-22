package oopsConcepts;

public class ClassA {
public int Salary;
public String Name;
protected String OrgName;

public ClassA()
{ System.out.println("Inside Constructor");
}
public ClassA(int val1, String val2, String val3)
{ System.out.println("Inside param Constructor");
this.Salary = val1;
this.Name= val2;
this.OrgName=val3;
}
public void Display()
{System.out.println("Name of the employee:" + Name);
System.out.println("Salary of the employee:" + Salary);
System.out.println("Organisation name of the employee:" + OrgName);
	}


}
