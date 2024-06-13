package day08.overloading.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //물려받은 메소드 그대로
		c.method02(); //물려받은 메소드 오버라이딩하여 변형
	}

}
