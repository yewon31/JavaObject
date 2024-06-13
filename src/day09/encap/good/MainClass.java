package day09.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();

		/*** year ***/
		me.setYear(2025);
		me.setYear(2024);
		int year = me.getYear();
		System.out.println("년도 : " + year);
		
		
		/*** month ***/
		me.setMonth(13);
		me.setMonth(12);
		int month = me.getMonth();
		System.out.println("월 : " + month);
		
		
		/*** day ***/
		me.setDay(32);
		me.setDay(31);
		int day = me.getDay();
		System.out.println("일 : " + day);
		
		
		/*** ssn ***/
		me.setSsn("1001231-4112233");
		me.setSsn("001231-4112233");
		String ssn = me.getSsn();
		System.out.println("주민등록번호 : " + ssn);
		
		
		
	}
}
