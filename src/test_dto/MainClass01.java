package test_dto;

import java.util.Scanner;

public class MainClass01 {

	public class TestClass07 {
	   private int age;
	   private String name;
	   public void myscan() {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("이름 입력");
	  name = scan.next();
	  System.out.println("나이 입력");
	      age = scan.nextInt();
	   }
	   public void setAge() {
	      age = age-1;
	   }
	   public void display() {
	      myscan();
	      setAge();
	      System.out.println("이름 : "+name);
	  System.out.println("만 나이 : "+age);
	  /*
	   입력, 출력, 나이 만으로 연산하는 각각의 기능을 만드세요
	   변수는 인스턴스 변수로 변경하여 사용하세요
	   */
	   }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		String name = null;
		 
		Scanner scan = new Scanner(System.in);
		MemberService mem= new MemberService();
		int num;
		while(true) {
			System.out.println("1. 이름 입력");
			System.out.println("2. 나이 입력");
			System.out.println("3. 모든 내용 출력");
			System.out.println("4. 종료");
			num = scan.nextInt();
			switch(num) {
			case 1://이름 입력
				mem.inputName();
				break;
			case 2://나이 입력
				mem.inputAge();
				break;
			case 3:
				mem.print();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}//switch
		}//while	      
	}
}


