package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//프로그램을 시작하는 class
		Scanner in = new Scanner(System.in); 
		Manager m = new Manager();
		IdeaWord iw = new IdeaWord();
		Idea [] save = null;
		while(true) {
			System.out.println("1.아이디어 공모  2.채택된 아이디어");
			int userNum = in.nextInt();	in.nextLine();

			if(userNum==1) {
				save = iw.menu();
			}else if(userNum==2) {
				m.menu(save);
			}else {
				System.out.println("번호 오류");
				break;
			}
		}//while 종료
		
	}//main()종료

}//class종료
