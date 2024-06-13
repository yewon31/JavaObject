package day09.modi.construct.pac1;

public class A {
	
	//접근 제한자는 클래스와 멤버변수, 메서드, 생성자의 접근을 제어할 수 있는 제한자입니다.
	
	A a = new A(1); //public(o)
	A a2 = new A(true); //default(o)
	A a3 = new A("홍"); //private(o)
	
	/*** 생성자 ***/
	public A(int a) {} 		//public
	A(boolean a) {} 		//default
	private A(String a) {} 	//private
}
