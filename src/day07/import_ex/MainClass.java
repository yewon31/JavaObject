package day07.import_ex;

import java.util.Scanner;

//import day07.abc.Apple;
//import day07.abc.Melon;
import day07.abc.*;

public class MainClass {

	public static void main(String[] args) {
		
		//abc패키지에 있는 Apple를 사용
		Apple apple = new Apple(); //동일한 이름을 가지고 있는 글래스들이 많음
		Melon melon = new Melon(); //참조타입
		
		Scanner scan = new Scanner(System.in);

		int a = 1;
		double b = 3.14; //기본타입변수 - 스택에 값을 저장

		System.out.println(a);
		System.out.println(melon);
	}

}
