package day07;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone red = new Phone(); //new 생성자()
		red.info();
		
		Phone black = new Phone("검정색");
		black.info();
		
		Phone white = new Phone("흰색", 100000);
		white.info();
		
		Phone blue = new Phone(100000, "파랑색");
		blue.info();
		
		Phone yellow = new Phone("노랑색", 200000, "샤오미");
		yellow.info();
	}

}
