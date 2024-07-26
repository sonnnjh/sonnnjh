package main;

import java.util.Scanner;

public class Manager {
//프로그램을 관리하는 class
	Scanner in = new Scanner(System.in); 
//	IdeaWord iw = new IdeaWord(); //test해보기>새로운 객체를 만들면 저장된값이 없어서?
	Idea [] selSave = new Idea[10]; //공모한 아이디어를 저장할 배열 선언, 자료형은 Idea class
	Idea [] Save = null; //IdeaWord의 save배열을 저장할 배열선언
	int pw = 1111;
	
	public void menu(Idea[] save) { //메뉴선택
		Save = save;
			System.out.println("관리자 비밀번호를 입력하세요");
			int userPw = in.nextInt(); in.nextLine();
			while(true) {
			if(userPw==pw) {
				System.out.println("1.공모한 아이디어  2.채택된 아이디어  3.이전으로 돌아가기");
				int userNum = in.nextInt(); in.nextLine();
				if(userNum==1) {
					ideaList();
				}else if (userNum==2) {
					selList();
				}else {
					break;
				}
			}
		}
		
	}//menu()종료
	
	public void ideaList() {  //아이디어 보기
		//1.아이디어보기 2.아이디어채택하기
		while(true) {
			System.out.println("1.아이디어보기  2.아이디어 채택하기  3.이전으로 돌아가기");
			int userNum = in.nextInt(); in.nextLine();
			if(userNum==1) {
				idlistAll();
			}else if (userNum==2){
				sel();
			}else {
				break;
			}
		}//while 종료
	}//ideaList()종료
	
	public void idlistAll() {  //아이디어 전체보기
		for(int i=0; i<Save.length; i++) {
			if(Save[i] != null) {
				System.out.println();
				System.out.println(i+"번의 공모한 아이디어 입니다");
				System.out.println("------------------------");
				System.out.println(Save[i].name);
				System.out.println(Save[i].text);
				System.out.println(Save[i].title);
			}
		}
	}//listAll()종료
	
	public void sellistAll() {  //채택한 아이디어 전체보기
		for(int i=0; i<Save.length; i++) {
			if(Save[i] != null) {
				System.out.println();
				System.out.println(i+"번의 채택한 아이디어 입니다");
				System.out.println("------------------------");
				System.out.println(selSave[i].name);
				System.out.println(selSave[i].text);
				System.out.println(selSave[i].title);
			}
		}
	}//listAll()종료
	
	public void sel() {  //아이디어 채택하기
		idlistAll();
		System.out.println("채택할 아이디어 번호를 선택해주세요");
		int userNum = in.nextInt(); in.nextLine();
//		selSave[userNum] = Save[userNum]; // 공모아이디어 저장된 것을 채택아이디어에 대입
//		selSave[userNum].name = Save[userNum].name; // 공모아이디어 저장된 것을 채택아이디어에 대입
//		selSave[userNum].title = Save[userNum].title; // 공모아이디어 저장된 것을 채택아이디어에 대입
//		selSave[userNum].text = Save[userNum].text; // 공모아이디어 저장된 것을 채택아이디어에 대입
//		selSave[userNum].pw = Save[userNum].pw; // 공모아이디어 저장된 것을 채택아이디어에 대입
		System.out.println("선택하신 아이디어가 채택되었습니다");
	}//sel()종료
	
	public void selList() {  //채택한 아이디어 보기
		//1.채택한 아이디어보기 2.채택한 아이디어 취소하기
		while(true) {
			System.out.println("1.채택한 아이디어보기 2.채택한 아이디어 취소하기  3.이전으로 돌아가기");
			int userNum = in.nextInt(); in.nextLine();
			if(userNum==1) {
				sellistAll();
			}else if(userNum==2) {
				cancel();
			}else {
				break;
			}
		}//while()종료
	}//selList()종료

	public void cancel() {  //채택한 아이디어 취소하기
		selList();
		System.out.println("취소할 채택한 아이디어를 선택하세요");
		int userNum = in.nextInt(); in.nextLine();
		selSave[userNum] = null;
	}//cancel()종료
	
}//class종료
