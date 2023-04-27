package OP02;

import java.util.HashMap;

public class Win10DTO {
	private HashMap<String, String> info;
	private String calc, notepad;
	private String msg;

	public HashMap<String, String> getInfo() {
		return info;
	}

	public void setInfo(HashMap<String, String> info) {
		this.info = info;
	}

	public String getCalc() {
		return calc;
	}

	public void setCalc(String calc) {
		this.calc = calc;
	}

	public String getNotepad() {
		return notepad;
	}

	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
