package main;

import java.util.Scanner;

import dao.MemberDAO;
import member.MemberADM;

public class Main{
	
	public static void main(String[] args) {
		MemberADM adm = new MemberADM();
		Scanner in = new Scanner(System.in);

		System.out.println("1.�α���  2.ȸ������  3.ȸ����ȸ");
		int selNum = in.nextInt();in.nextLine();
		if(selNum==1) {
			System.out.println("----------�α���----------");
			System.out.println("���̵� �Է�");
			String id = in.nextLine();
			System.out.println("��й�ȣ �Է�");
			String pw = in.nextLine();
			adm.mod(id);
		}else if(selNum==2){
			System.out.println("----------ȸ������----------");
			adm.add();
		}else if(selNum==3) {
			System.out.println("----------ȸ����ȸ----------");
			adm.selectMember();
		}
		
	}
}
