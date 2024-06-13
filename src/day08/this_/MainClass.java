package day08.this_;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person(); //부모
		Person p2 = new Person("홍길동");
		Person p3 = new Person("홍길자", 20);
		System.out.println( p.info() );
		System.out.println( p2.info() );
		System.out.println( p3.info() );
		
		Student s = new Student("홍길자", 20, "123123");
		System.out.println( s.info() );
		
		Employee e = new Employee("신사임당", 30, "미술부");
		System.out.println( e.info() );
		
		Teacher t = new Teacher("이순신", 40, "체육");
		System.out.println( t.info() );
	}
}
