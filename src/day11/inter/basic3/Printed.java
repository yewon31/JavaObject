package day11.inter.basic3;

public interface Printed {

	//마이크로소프트에서 우리의 프린트 소프트를 사용하려면, 이메서드를 구현하면됩니다.
	public void print(String document);
	public void colorPrint(String document, String color);
	public int copy(int cnt);
	
	
}
