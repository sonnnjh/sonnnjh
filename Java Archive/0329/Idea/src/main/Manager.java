package main;

import java.util.Scanner;

public class Manager {
//���α׷��� �����ϴ� class
	Scanner in = new Scanner(System.in); 
//	IdeaWord iw = new IdeaWord(); //test�غ���>���ο� ��ü�� ����� ����Ȱ��� ���?
	Idea [] selSave = new Idea[10]; //������ ���̵� ������ �迭 ����, �ڷ����� Idea class
	Idea [] Save = null; //IdeaWord�� save�迭�� ������ �迭����
	int pw = 1111;
	
	public void menu(Idea[] save) { //�޴�����
		Save = save;
			System.out.println("������ ��й�ȣ�� �Է��ϼ���");
			int userPw = in.nextInt(); in.nextLine();
			while(true) {
			if(userPw==pw) {
				System.out.println("1.������ ���̵��  2.ä�õ� ���̵��  3.�������� ���ư���");
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
		
	}//menu()����
	
	public void ideaList() {  //���̵�� ����
		//1.���̵��� 2.���̵��ä���ϱ�
		while(true) {
			System.out.println("1.���̵���  2.���̵�� ä���ϱ�  3.�������� ���ư���");
			int userNum = in.nextInt(); in.nextLine();
			if(userNum==1) {
				idlistAll();
			}else if (userNum==2){
				sel();
			}else {
				break;
			}
		}//while ����
	}//ideaList()����
	
	public void idlistAll() {  //���̵�� ��ü����
		for(int i=0; i<Save.length; i++) {
			if(Save[i] != null) {
				System.out.println();
				System.out.println(i+"���� ������ ���̵�� �Դϴ�");
				System.out.println("------------------------");
				System.out.println(Save[i].name);
				System.out.println(Save[i].text);
				System.out.println(Save[i].title);
			}
		}
	}//listAll()����
	
	public void sellistAll() {  //ä���� ���̵�� ��ü����
		for(int i=0; i<Save.length; i++) {
			if(Save[i] != null) {
				System.out.println();
				System.out.println(i+"���� ä���� ���̵�� �Դϴ�");
				System.out.println("------------------------");
				System.out.println(selSave[i].name);
				System.out.println(selSave[i].text);
				System.out.println(selSave[i].title);
			}
		}
	}//listAll()����
	
	public void sel() {  //���̵�� ä���ϱ�
		idlistAll();
		System.out.println("ä���� ���̵�� ��ȣ�� �������ּ���");
		int userNum = in.nextInt(); in.nextLine();
//		selSave[userNum] = Save[userNum]; // ������̵�� ����� ���� ä�þ��̵� ����
//		selSave[userNum].name = Save[userNum].name; // ������̵�� ����� ���� ä�þ��̵� ����
//		selSave[userNum].title = Save[userNum].title; // ������̵�� ����� ���� ä�þ��̵� ����
//		selSave[userNum].text = Save[userNum].text; // ������̵�� ����� ���� ä�þ��̵� ����
//		selSave[userNum].pw = Save[userNum].pw; // ������̵�� ����� ���� ä�þ��̵� ����
		System.out.println("�����Ͻ� ���̵� ä�õǾ����ϴ�");
	}//sel()����
	
	public void selList() {  //ä���� ���̵�� ����
		//1.ä���� ���̵��� 2.ä���� ���̵�� ����ϱ�
		while(true) {
			System.out.println("1.ä���� ���̵��� 2.ä���� ���̵�� ����ϱ�  3.�������� ���ư���");
			int userNum = in.nextInt(); in.nextLine();
			if(userNum==1) {
				sellistAll();
			}else if(userNum==2) {
				cancel();
			}else {
				break;
			}
		}//while()����
	}//selList()����

	public void cancel() {  //ä���� ���̵�� ����ϱ�
		selList();
		System.out.println("����� ä���� ���̵� �����ϼ���");
		int userNum = in.nextInt(); in.nextLine();
		selSave[userNum] = null;
	}//cancel()����
	
}//class����
