package day08.overriding.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(10);
		b.input("홍길동");
		b.input(1, 3.14);
		b.input(3.14, 1);
	}
}
