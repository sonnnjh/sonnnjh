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
		title.setText("�α���"); //�α������� title����
		btn2.setText("�ڷΰ���"); //�ڷΰ���� btn2����
		jp[1].add(title);
		jp[2].add(id);
		jp[2].add(tf);//���̵��Է�
		jp[3].add(pw);
		jp[3].add(tf2); //��й�ȣ �Է�
		jp[4].add(btn); //�α��� ��ư
		jp[4].add(btn2); //�ڷΰ��� ��ư
		btn.addActionListener(this); // ���α׷� ����
		btn2.addActionListener(this); //�ڷΰ��� ����
		dto2();
	}
	public void show() {
		jf.setVisible(true); //â ���̱�
	}
	public void checkMember() { //db���� ȸ������ ��ȸ 
		JoinDto jd = dao.selectUser(tf.getText(), tf2.getText());
			try {
				if( jd.getId().equals(tf.getText()) ) {
					if(jd.getPw().equals(tf2.getText())) {
						System.out.println("ȸ�������� ��ġ�մϴ�");
					}
				}
			}catch (Exception e) {
				System.out.println("��ϵ� ȸ���� �ƴմϴ�");
			}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) {
			checkMember();
			jf.setVisible(false);
			//���� â show
		}else if(e.getSource().equals(btn2)) {
			jf.setVisible(false);
			Main main = new Main();
			main.show();
		}
	}
}//class����
