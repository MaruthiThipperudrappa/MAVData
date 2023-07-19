package streams_Java8;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Cloneable,Serializable{

	
	String name;
	Integer Salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	

	
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
