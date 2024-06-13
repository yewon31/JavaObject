package day09.super_;

public class Child extends Parent {
	
//	Child() {
//		super(); //부모의 기본생성자
//	}	

	/*
	 *
		- 자식은 super() 동해서 부모님의 생성자와 연결이 되어 있습니다.
		- 해결방법
			1. 부모님의 기본생성자를 만든다.
			2. 부모님의 생성자 타입과 강제 연결
	 */

	Child(String father, String mother) {
		//super()
		super(father, mother);
	}
	
	
	
	
	
	
	
	
}
