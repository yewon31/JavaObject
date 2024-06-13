package day07;

public class ObjectBasic02 {

	public static void main(String[] args) {

		//기존에 사용하던 방법
		System.out.println(" ---- 1번 계산기 ---- ");
		Calculator cal1 = new Calculator(); //객체
		System.out.println( cal1.add(1) );
		System.out.println( cal1.add(2) );
		System.out.println( cal1.add(3));

		System.out.println(" ---- 2번 계산기 ---- ");
		Calculator cal2 = new Calculator();
		System.out.println( cal2.add(11) );
		System.out.println( cal2.add(22) );
	}
	
}
