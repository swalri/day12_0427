package OP01;

import java.util.Scanner;

public class TempMain {
	public static void main(String[] args) {
		int temp = 10;
		Scanner scan = new Scanner(System.in);
		TempService ts = new TempService();
		int num;
		while(true) {
			System.out.println("1. 온도올리기");
			System.out.println("2. 온도내리기");
			System.out.println("3. 현재 설정 정보");
			System.out.println("4. 종료");
			num = scan.nextInt();
			switch(num) {
			case 1:
				ts.up();
				break;
			case 2:
				ts.down();
				break;
			case 3:
				ts.print();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}


