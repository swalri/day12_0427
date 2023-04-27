package constructor;
/*
constructor(생성자)
 - 초기화 목적
 - 객체를 생성할 때 자동으로 호출한다
 - 클래스 이름과 동일한 메소드 이름을 가지며 반환 타입, 값은 없다.	
*/

class TestClass01{
	private int age;
	public void test() {
		System.out.println("test");
	}
	public TestClass01(int age) {//기본생성자+부속품
		System.out.println(age+" : 생성자 호출");
		this.age=0;
	}
	public TestClass01() {//기본생성자
		System.out.println("기본생성자");
	}
	public TestClass01(int a, int b) {
		System.out.println("2개 받아줌");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(10);
		TestClass01 t02 = new TestClass01();
		TestClass01 t03 = new TestClass01(1,2);
//		t.test();
		String s = new String();
		String s1 = new String("aaa");
//		System.out.println(s1);
	}
}


