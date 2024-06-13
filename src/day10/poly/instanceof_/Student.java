package day10.poly.instanceof_;

public class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
	
}
