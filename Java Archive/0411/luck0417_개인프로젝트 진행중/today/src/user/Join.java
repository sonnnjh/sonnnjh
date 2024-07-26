package user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Dto;
import main.Main;
import userDao.UserDao;

public class Join extends Dto implements ActionListener{
	UserDao dao = new UserDao();
	
	public Join(){
		dto1();
		title.setText("회원가입"); //회원가입으로 title수정
		btn.setText("뒤로가기"); //뒤로가기로 btn수정
		jp[0].add(title);
		jp[1].add(id);
		jp[1].add(tf); //아이디입력
		jp[2].add(pw);
		jp[2].add(tf2); //비번입력
		jp[3].add(text3);
		jp[3].add(tf3); //이름입력
		jp[4].add(text4);
		jp[4].add(tf4); //생년월일 입력
		jp[5].add(btn2); //회원가입 버튼
		jp[5].add(btn); //뒤로가기 버튼
		btn2.addActionListener(this); //회원가입 실행//로그인실행
		btn.addActionListener(this); //뒤로가기 실
		dto2();
	}
	public void show() {
		jf.setVisible(true); //창 보이기
	}
	public void saveMember() {
		JoinDto jd = new JoinDto();
		jd.setId(tf.getText());
		jd.setPw(tf2.getText());
		jd.setName(tf3.getText());
		jd.setBirth(tf4.getText());
		dao.insert(jd);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn2)) {
			saveMember();
			jf.setVisible(false);
			Login login = new Login();
			login.show();
		}else if(e.getSource().equals(btn)) {
			jf.setVisible(false);
			Main main = new Main();
			main.show();
		}
	}
}//class종료
