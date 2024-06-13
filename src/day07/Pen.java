package day07;

public class Pen {

	//클래스 속성을 나타내는 뎀버변수(필드)
	String ink;
	int price;
	String company;

	//클래스 기능을 표현하는 메서드
	void write() {
		System.out.println(ink + " 글씨를 씁니다");
	}

	void info() {
		System.out.println(" ---- 펜의 정보 ---- ");
		System.out.println("색상:" + ink);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
		System.out.println();
	}
	
	//생성자는 프로그래머가 직접 만들게 되면, 기본생성자를 자동으로 만들어주지 않음
	//Pen(String ink) {
	//}

}
