package com.ezen.sol3;

public class ScoreDTO {

	String name;
	int kor,eng,mat,tot;
	
	public ScoreDTO() {	}

	public ScoreDTO(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;


	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		
		
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
			
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
		
	}
	
	public void out() {
		tot=getKor()+getEng()+getMat();
		System.out.println("이름 : "+name+"\n"+
	"국어 : "+kor+"\n"+"영어 : "+eng+"\n"+"수학 : "+mat+"\n"+"총점 : "+tot+"\n");
	}
	
		
	
}
