package main;

import java.util.Scanner;

public class IdeaWord {
//���� ���� �����ϴ� class
	
	Idea [] save = new Idea [10]; //������ ���̵� ������ �迭 ����, �ڷ����� Idea class
	
	Scanner in = new Scanner(System.in);
	
	public Idea[] menu(){ //�޴�����
		while(true) {
			System.out.println("1.���̵�� �ۼ�  2.���̵�� ����  3.���̵�� ��ü����  4.���� �޴��� ���ư���");
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
	}//menu()����
	
	public void insert() { //���̵�� �ۼ�
		Idea idea1 = new Idea(); 
		System.out.println("���̵�� ������ �ۼ��ϼ���");
		idea1.title = in.nextLine();
		System.out.println("���̵�� ������ �ۼ��ϼ���");
		idea1.text = in.nextLine();
		System.out.println("�ۼ����� �̸��� �ۼ��ϼ���");
		idea1.name = in.nextLine();
		System.out.println("���̵�� ��й�ȣ�� �ۼ��ϼ���");
		idea1.pw = in.nextInt(); in.nextLine();
		for(int i=0; i<save.length; i++) {
			if(save[i]==null) { //������ ���̵� �迭�� �����ϴµ� �迭�� ĭ�� �������
			save[i] = idea1;
			break;
		}
	}
	System.out.println("���̵�� ���� �Խð� �Ϸ�Ǿ����ϴ�");
	}//insert()����
	
	public void mod() {  //���̵�� ����
		listAll();
		System.out.println("������ ���̵�� ��ȣ�� �Է��ϼ���");
		int userNum = in.nextInt(); in.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		int userPw = in.nextInt(); in.nextLine();
		if(save[userNum].pw==userPw) {
			System.out.println("������ ������ �������ּ��� 1.����  2.����  3.�̸�  4.��й�ȣ");
			int userSel = in.nextInt(); in.nextLine();
			if(userSel==1) { //���� ����
				System.out.println("������ ������ �Է����ּ���");
				save[userNum].title = in.nextLine();
			}else if(userSel==2) { //���� ����
				System.out.println("������ ������ �Է����ּ���");
				save[userNum].text = in.nextLine();
			}else if(userSel==3) { //�̸� ����
				System.out.println("������ �̸��� �Է����ּ���");
				save[userNum].name = in.nextLine();
			}else if(userSel==4) { //��й�ȣ ����
				System.out.println("������ ��й�ȣ�� �Է����ּ���");
				save[userNum].pw = in.nextInt(); in.nextLine();
			}else {
				System.out.println("��й�ȣ ����");
			}
		System.out.println("���̵� �����Ǿ����ϴ�");
		}
	}//mod()����
	
	public void listAll() {  //���̵�� ��ü����
		for(int i=0; i<save.length; i++) {
			if(save[i] != null) {
				System.out.println();
				System.out.println(i+"���� ���̵�� �Դϴ�");
				save[i].prt();
			}
		}
	}//listAll()����

}//class����
