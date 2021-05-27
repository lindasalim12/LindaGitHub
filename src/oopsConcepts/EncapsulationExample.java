package oopsConcepts;

public class EncapsulationExample {
	//Encapsulation -hiding the data in the class
	private int salary;// should not be public or else it would be visible to the rest of the world, use getters and setters to get data from the customers
	private String name;// should not be public
	private String EmpId;// should not be public
	
	//getters and setters are made public so the it can be called from the runner class
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	

}
