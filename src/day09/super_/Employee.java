package day09.super_;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department) {
		//[1]
		//this.name = name;
		//this.age = age;
		//[2]
		super(name, age);
		this.department = department;
	}

	String info() {
		//return "이름 : " + name + ", 나이 : " + age + ", 부서 : " + department;
		return super.info() + ", 부서 : " + department;
	}
}
