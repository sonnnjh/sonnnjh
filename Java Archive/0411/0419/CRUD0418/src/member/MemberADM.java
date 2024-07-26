package member;

import java.util.Scanner;

import dao.MemberDAO;

public class MemberADM {//회원관리
	Scanner in = new Scanner(System.in);
	MemberDAO dao = new MemberDAO();
	
	public void selectMember() {//회원 조회
		System.out.println("조회할 아이디 입력");
		String selectId = in.nextLine();
		MemberDTO member = dao.select(selectId);
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.name);
	}

	public void del() { //회원삭제
		
	}

	public void mod(String userId) { //회원수정
		String modPw=null;
		String modName=null;
		
//		System.out.println("1.비밀번호 변경  2.이름변경");
//		int selNum = in.nextInt(); in.nextLine();
//		
//		if(selNum ==1) {
//			System.out.println("변경할 비밀번호 입력");
//			modPw = in.nextLine();
//		}else if(selNum==2) {
//			System.out.println("변경할 이름 입력");
//			modName = in.nextLine();
//		}
//		dao.update(userId, modPw, modName);
		
		System.out.println("변경할 비밀번호 입력");
		modPw = in.nextLine();
		System.out.println("변경할 이름 입력");
		modName = in.nextLine();
		dao.update(userId, modPw, modName);
	}

	public void add() { // 회원등록
		MemberDTO dto = new MemberDTO();
		System.out.println("아이디 입력");
		dto.setId(in.nextLine());
		System.out.println("비밀번호 입력");
		dto.setPw(in.nextLine());
		System.out.println("이름 입력");
		dto.setName(in.nextLine());
		dao.insert(dto);
	}
	
	
}//클래스 종료
