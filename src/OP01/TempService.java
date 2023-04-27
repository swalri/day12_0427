package OP01;

public class TempService {
	private TempDTO dto = new TempDTO();
	public void up(){
		int t = dto.getTemp();
		t += 1;
		dto.setTemp(t);
		System.out.println("온도를 올렸습니다");
	}	
	public void down(){
		int t = dto.getTemp();
		t -= 1;
		dto.setTemp(t);
		System.out.println("온도를 내렸습니다");
	}
	public void print() {
		System.out.println("현재온도는 "+dto.getTemp()+"도 입니다");
	}
}


