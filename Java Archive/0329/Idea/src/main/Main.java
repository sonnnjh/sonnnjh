package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//���α׷��� �����ϴ� class
		Scanner in = new Scanner(System.in); 
		Manager m = new Manager();
		IdeaWord iw = new IdeaWord();
		Idea [] save = null;
		while(true) {
			System.out.println("1.���̵�� ����  2.ä�õ� ���̵��");
			int userNum = in.nextInt();	in.nextLine();

			if(userNum==1) {
				save = iw.menu();
			}else if(userNum==2) {
				m.menu(save);
			}else {
				System.out.println("��ȣ ����");
				break;
			}
		}//while ����
		
	}//main()����

}//class����
