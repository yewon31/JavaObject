package day11.inter.basic2;

public class Cat extends Animal implements IPet {

	@Override
	public void eating() {
		System.out.println("고양이는 생선을 먹어용");
	}

	@Override
	public void playing() {
		System.out.println("고양이는 방에서 놀아용");
	}

}
