package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import user.Join;
import user.Login;

public class Main extends Dto implements ActionListener{
	
	public static void main(String[] args) {
		new Main();
//		new Join();
	}
	public Main(){
		dto1();
		jp[2].add(title);
		jp[3].add(btn); //로그인 버튼
		jp[3].add(btn2); //회원가입 버튼
		btn.addActionListener(this); //로그인 버튼에 액션리스너 설정
		btn2.addActionListener(this); //회원가입 버튼에 액션리스너 설정
		dto2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) { //로그인 버튼 누르면
			jf.setVisible(false);
			Login login = new Login();
			login.show();
		}else if(e.getSource().equals(btn2)) { //회원가입 버튼 누르면
			jf.setVisible(false);
			Join join = new Join();
			join.show(); //회원가입 클래스 창 보여주기
		}
	}
	
}//class종료
