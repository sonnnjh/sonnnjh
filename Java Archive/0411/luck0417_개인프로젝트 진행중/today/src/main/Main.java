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
		jp[3].add(btn); //�α��� ��ư
		jp[3].add(btn2); //ȸ������ ��ư
		btn.addActionListener(this); //�α��� ��ư�� �׼Ǹ����� ����
		btn2.addActionListener(this); //ȸ������ ��ư�� �׼Ǹ����� ����
		dto2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn)) { //�α��� ��ư ������
			jf.setVisible(false);
			Login login = new Login();
			login.show();
		}else if(e.getSource().equals(btn2)) { //ȸ������ ��ư ������
			jf.setVisible(false);
			Join join = new Join();
			join.show(); //ȸ������ Ŭ���� â �����ֱ�
		}
	}
	
}//class����
