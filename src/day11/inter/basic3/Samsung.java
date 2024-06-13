package day11.inter.basic3;

public class Samsung implements Printed {
	
	
	@Override
	public void print(String document) {
		System.out.println("삼성:" + document);		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("삼성:" + document + ", 색상:" + color);
	}

	@Override
	public int copy(int cnt) {
		
		for(int i = 1; i <= cnt; i++) {
			System.out.println(i + "장 복사");
		}
		
		return cnt;
	}

}
