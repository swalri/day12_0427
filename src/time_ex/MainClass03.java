package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		ProcessBuilder pro = new ProcessBuilder();
		//window실행
//		pro.command("calc");//계산기
//		pro.command("mspaint");//그림판
		try {
			pro.start();//실행
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


