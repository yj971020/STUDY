package ch07;

public class Employee {
	private String name;
	private Date birthDate;
	
	public Employee(String name, Date birthDate) {
		this.name=name;
		this.birthDate=birthDate;
	}
	
	public String toString(){
		return "Em name:"+name+", birth:"+birthDate;
	}

}
