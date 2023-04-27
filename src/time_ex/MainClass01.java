package time_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println(t);
		
		Date dt = new Date();
		System.out.println(dt);
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy년-MM월-dd일 aa hh시 mm분 ss초");
		String s_t = s.format(dt);
		System.out.println(s_t);
	}
}


