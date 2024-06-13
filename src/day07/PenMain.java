package day07;

public class PenMain {

	public static void main(String[] args) {
		
		//클래스명 변수명 = new 클래스명();
		Pen black = new Pen();
		black.ink = "검정색";
		black.price = 2000;
		black.company = "모나미";
		black.write();
		black.info();

		//발간펜
		Pen red = new Pen();
		red.ink = "빨간색";
		red.price = 1000;
		red.company = "하이테크";
		red.write();
		red.info();
		
		Variable v = new Variable();
		v.printNum(10);
		
	}

}
