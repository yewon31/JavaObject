package day09.super_;

//부모클래스
public class Parent {
	
	String father;
	String mother;

	Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}

//	Parent() {
//	}
	
	String info() {
		return "부 : " + father + ", 모 : " + mother;
	}

}
