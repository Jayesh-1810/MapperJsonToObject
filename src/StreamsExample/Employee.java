package StreamsExample;

import java.util.List;

public class Employee implements Comparable<Employee>{

	int id;
    String name;
    int salary;
    String location;
    List<String> skills;
    
    
	public Employee(int id, String name, int salary, String location, List<String> skills) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
		this.skills = skills;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getSalary() {
		return salary;
	}





	public void setSalary(int salary) {
		this.salary = salary;
	}





	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	public List<String> getSkills() {
		return skills;
	}





	public void setSkills(List<String> skills) {
		this.skills = skills;
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + ", skills="
				+ skills + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
    
    
}
