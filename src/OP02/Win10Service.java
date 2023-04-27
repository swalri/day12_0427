package OP02;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class Win10Service {
	Win10DTO dto;
	public Win10Service() {
		dto = new Win10DTO();
		HashMap<String, String> map = new HashMap<>();
		map.put("장치 이름", "DESKTOP-7Q0C2B6");
		map.put("프로세서", "Intel(R) Core(TM) i7-7700 CPU @ 3.60GHz   3.60 GHz");
		map.put("설치된 RAM", "16.0GB");
		map.put("시스템 종류", "64비트 운영 체제, x64 기반 프로세서");
		dto.setInfo(map);
	}
	//성능(info)
	public void display() {
		Iterator<String> it_key = dto.getInfo().keySet().iterator();
		Iterator<String> it_values = dto.getInfo().values().iterator();
		while(it_key.hasNext()) {
			System.out.println(it_key.next()+" : "+it_values.next());
		}
	}
	//기능
	public void process(String s) {
		ProcessBuilder pro = new ProcessBuilder();
		pro.command(s);//그림판
		try {
			pro.start();//실행
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


