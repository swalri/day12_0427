package test_dto;

import java.util.Scanner;

//값을 연산
public class MemberService {
	Scanner scan = new Scanner(System.in);
	MemberDTO dto = new MemberDTO();
	//이름 입력
	public void inputName() {
		System.out.println("이름 입력");
		String name = scan.next();
		dto.setName(name);
	}
	//나이 입력
	public void inputAge() {
		System.out.println("나이 입력");
//		int age = scan.nextInt();
		dto.setAge(scan.nextInt());
	}
	//출력
	public void print() {
		System.out.println("이름 : " + dto.getName());
		int age = dto.getAge();
		System.out.println("만 나이 : "+age);
	}
}


