package main;

public class Idea {
//공모 글의 구조를 기능하는 class
	String title = null; //제목
	String text = null;  //본문
	String name = null;  //작성자 
	int pw = 0;          //비밀번호
	
	public  void prt() { //전체보기
	
		System.out.println("------------------------");
		System.out.println("아이디어 제목은 : " + title);
		System.out.println("아이디어 본문은 : " + text);
		System.out.println("작성자는 : " + name);
//		System.out.println("비밀번호는 : " + pw);
	}//prt()종료

}//class종료
