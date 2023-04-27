package time_ex;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("시작");
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);//3초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//예외 처리
		long end = System.currentTimeMillis();
		System.out.println("끝");
		System.out.println(end-start/1000);
	}
}


