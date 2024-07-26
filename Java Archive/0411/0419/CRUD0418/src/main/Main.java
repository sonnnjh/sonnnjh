package main;

import java.util.Scanner;

import dao.MemberDAO;
import member.MemberADM;

public class Main{
	
	public static void main(String[] args) {
		MemberADM adm = new MemberADM();
		Scanner in = new Scanner(System.in);

		System.out.println("1.로그인  2.회원가입  3.회원조회");
		int selNum = in.nextInt();in.nextLine();
		if(selNum==1) {
			System.out.println("----------로그인----------");
			System.out.println("아이디 입력");
			String id = in.nextLine();
			System.out.println("비밀번호 입력");
			String pw = in.nextLine();
			adm.mod(id);
		}else if(selNum==2){
			System.out.println("----------회원가입----------");
			adm.add();
		}else if(selNum==3) {
			System.out.println("----------회원조회----------");
			adm.selectMember();
		}
		
	}
}
