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
		title.setText("ȸ������"); //ȸ���������� title����
		btn.setText("�ڷΰ���"); //�ڷΰ���� btn����
		jp[0].add(title);
		jp[1].add(id);
		jp[1].add(tf); //���̵��Է�
		jp[2].add(pw);
		jp[2].add(tf2); //����Է�
		jp[3].add(text3);
		jp[3].add(tf3); //�̸��Է�
		jp[4].add(text4);
		jp[4].add(tf4); //������� �Է�
		jp[5].add(btn2); //ȸ������ ��ư
		jp[5].add(btn); //�ڷΰ��� ��ư
		btn2.addActionListener(this); //ȸ������ ����//�α��ν���
		btn.addActionListener(this); //�ڷΰ��� ��
		dto2();
	}
	public void show() {
		jf.setVisible(true); //â ���̱�
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
}//class����
