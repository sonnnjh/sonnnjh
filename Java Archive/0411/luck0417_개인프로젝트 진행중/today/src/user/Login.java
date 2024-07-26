package user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import main.Dto;
import main.Main;
import userDao.UserDao;

public class Login extends Dto implements ActionListener{
	UserDao dao = new UserDao();
	public Login(){
		dto1();
		title.setText("로그인"); //로그인으로 title수정
		btn2.setText("뒤로가기"); //뒤로가기로 btn2수정
		jp[1].add(title);
		jp[2].add(id);
		jp[2].add(tf);//아이디입력
		jp[3].add(pw);
		jp[3].add(tf2); //비밀번호 입력
		jp[4].add(btn); //로그인 버튼
		jp[4].add(btn2); //뒤로가기 버튼
		btn.addActionListener(this); // 프로그램 실행
		btn2.addActionListener(this); //뒤로가기 실행
		dto2();
	}
	public void show() {
		jf.setVisible(true); //창 보이기
	}
	public void checkMember() { //db에서 회원정보 조회 
		JoinDto jd = dao.selectUser(tf.getText(), tf2.getText());
			try {
				if( jd.getId().equals(tf.getText()) ) {
					if(jd.getPw().equals(tf2.getText())) {
						System.out.println("회원정보가 일치합니다");
					}
				}
			}catch (Exception e) {
				System.out.println("등록된 회원이 아닙니다");
			}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			checkMember();
			jf.setVisible(false);
			//다음 창 show
		}else if(e.getSource().equals(btn2)) {
			jf.setVisible(false);
			Main main = new Main();
			main.show();
		}
	}
}//class종료
