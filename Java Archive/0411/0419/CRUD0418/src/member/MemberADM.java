package member;

import java.util.Scanner;

import dao.MemberDAO;

public class MemberADM {//ȸ������
	Scanner in = new Scanner(System.in);
	MemberDAO dao = new MemberDAO();
	
	public void selectMember() {//ȸ�� ��ȸ
		System.out.println("��ȸ�� ���̵� �Է�");
		String selectId = in.nextLine();
		MemberDTO member = dao.select(selectId);
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.name);
	}

	public void del() { //ȸ������
		
	}

	public void mod(String userId) { //ȸ������
		String modPw=null;
		String modName=null;
		
//		System.out.println("1.��й�ȣ ����  2.�̸�����");
//		int selNum = in.nextInt(); in.nextLine();
//		
//		if(selNum ==1) {
//			System.out.println("������ ��й�ȣ �Է�");
//			modPw = in.nextLine();
//		}else if(selNum==2) {
//			System.out.println("������ �̸� �Է�");
//			modName = in.nextLine();
//		}
//		dao.update(userId, modPw, modName);
		
		System.out.println("������ ��й�ȣ �Է�");
		modPw = in.nextLine();
		System.out.println("������ �̸� �Է�");
		modName = in.nextLine();
		dao.update(userId, modPw, modName);
	}

	public void add() { // ȸ�����
		MemberDTO dto = new MemberDTO();
		System.out.println("���̵� �Է�");
		dto.setId(in.nextLine());
		System.out.println("��й�ȣ �Է�");
		dto.setPw(in.nextLine());
		System.out.println("�̸� �Է�");
		dto.setName(in.nextLine());
		dao.insert(dto);
	}
	
	
}//Ŭ���� ����
