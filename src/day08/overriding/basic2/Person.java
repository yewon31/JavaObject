package day08.overriding.basic2;

//부모클래스 - 공통으로 사용될 기능
public class Person {
	
	String name;
	int age;

	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}

}
