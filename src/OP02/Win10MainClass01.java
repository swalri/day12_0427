package OP02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Win10MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		HashMap<String, String> info = new HashMap<>();
		Win10Service ws = new Win10Service();
		String calc = "calc", notepad = "notepad";
		String msg = null;

		int num;
		while(true) {
			System.out.println("1. 성능(info)");
			System.out.println("2. 기능사용");
			System.out.println("3. 종료");
			num = scan.nextInt();
			switch(num) {
			case 1:
				ws.display();
				break;
			case 2:
				System.out.println("1. calc");
				System.out.println("2. notepad");
				System.out.println("3. 직접입력");
				num = scan.nextInt();
				switch(num) {
				case 1:
					ws.process(calc);
					break;
				case 2:
					ws.process(notepad);
					break;
				case 3:
					System.out.print("입력 : ");
					msg = scan.next();
					ws.process(msg);
					break;
				default:
					System.out.println("잘못입력");
					break;
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}//switch
		}//while
	}
}


