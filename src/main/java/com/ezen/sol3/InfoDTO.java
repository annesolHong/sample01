package com.ezen.sol3;

public class InfoDTO {
	String id,pw;

	public InfoDTO() { }

	public InfoDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void out() {
		System.out.println("���̵� : "+id+"\n"+"�н����� : "+pw);
	}
	

}
