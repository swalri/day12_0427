package time_ex;

import java.text.SimpleDateFormat;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("시작");
		SimpleDateFormat s = new SimpleDateFormat("hh시 mm분 ss초");		
		long start = System.currentTimeMillis();
		String s_t = s.format(start);
		System.out.println(s_t);
		try {
			Thread.sleep(2000);//2초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//예외 처리
		long end = System.currentTimeMillis();
		s_t = s.format(end);
		System.out.println(s_t);
		System.out.println("끝");
	
		s_t = s.format(end-start);
		System.out.println(s_t);
		
		System.out.println(end-start/1000);
	}
}


