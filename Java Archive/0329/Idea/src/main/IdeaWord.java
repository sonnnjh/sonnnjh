package main;

import java.util.Scanner;

public class IdeaWord {
//공모 글을 관리하는 class
	
	Idea [] save = new Idea [10]; //공모한 아이디어를 저장할 배열 선언, 자료형은 Idea class
	
	Scanner in = new Scanner(System.in);
	
	public Idea[] menu(){ //메뉴선택
		while(true) {
			System.out.println("1.아이디어 작성  2.아이디어 수정  3.아이디어 전체보기  4.이전 메뉴로 돌아가기");
			int userNum = in.nextInt(); in.nextLine();
			if(userNum==1) {
				insert();
			}else if (userNum==2) {
				mod();
			}else if (userNum==3) {
				listAll();
			}else if (userNum==4){
				return save;
			}
		}
	}//menu()종료
	
	public void insert() { //아이디어 작성
		Idea idea1 = new Idea(); 
		System.out.println("아이디어 제목을 작성하세요");
		idea1.title = in.nextLine();
		System.out.println("아이디어 본문을 작성하세요");
		idea1.text = in.nextLine();
		System.out.println("작성자의 이름을 작성하세요");
		idea1.name = in.nextLine();
		System.out.println("아이디어 비밀번호를 작성하세요");
		idea1.pw = in.nextInt(); in.nextLine();
		for(int i=0; i<save.length; i++) {
			if(save[i]==null) { //공모할 아이디어를 배열에 저장하는데 배열의 칸이 비었으면
			save[i] = idea1;
			break;
		}
	}
	System.out.println("아이디어 공모 게시가 완료되었습니다");
	}//insert()종료
	
	public void mod() {  //아이디어 수정
		listAll();
		System.out.println("수정할 아이디어 번호를 입력하세요");
		int userNum = in.nextInt(); in.nextLine();
		System.out.println("비밀번호를 입력하세요");
		int userPw = in.nextInt(); in.nextLine();
		if(save[userNum].pw==userPw) {
			System.out.println("수정할 사항을 선택해주세요 1.제목  2.본문  3.이름  4.비밀번호");
			int userSel = in.nextInt(); in.nextLine();
			if(userSel==1) { //제목 수정
				System.out.println("수정할 제목을 입력해주세요");
				save[userNum].title = in.nextLine();
			}else if(userSel==2) { //본문 수정
				System.out.println("수정할 본문을 입력해주세요");
				save[userNum].text = in.nextLine();
			}else if(userSel==3) { //이름 수정
				System.out.println("수정할 이름을 입력해주세요");
				save[userNum].name = in.nextLine();
			}else if(userSel==4) { //비밀번호 수정
				System.out.println("수정할 비밀번호를 입력해주세요");
				save[userNum].pw = in.nextInt(); in.nextLine();
			}else {
				System.out.println("비밀번호 오류");
			}
		System.out.println("아이디어가 수정되었습니다");
		}
	}//mod()종료
	
	public void listAll() {  //아이디어 전체보기
		for(int i=0; i<save.length; i++) {
			if(save[i] != null) {
				System.out.println();
				System.out.println(i+"번의 아이디어 입니다");
				save[i].prt();
			}
		}
	}//listAll()종료

}//class종료
