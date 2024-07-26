package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import login.Join;
import login.Login;

public class Main extends JFrame implements ActionListener {
	Login login = new Login();
	Join join = new Join();
	
	JPanel [] jp = new JPanel[4];
	JLabel title1 = new JLabel("������ �");
	JButton loginBtn = new JButton("�α���");
	JButton joinBtn = new JButton("ȸ������");
	
	Main(String title){
		this.setTitle(title);
		this.setLayout(new GridLayout(4, 1));
		for(int i=0; i<jp.length; i++) {
			jp[i] = new JPanel();
			this.add(jp[i]);
		}
		jp[1].add(title1);
		jp[2].add(loginBtn);
		jp[2].add(joinBtn);
		
		loginBtn.addActionListener(this);
		joinBtn.addActionListener(this);
		
		this.setBounds(500, 500, 300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}//������ ����
	
	public static void main(String[] args) {
		new Main("������ �");
	}//���α׷� ����

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(loginBtn)) {
			this.setVisible(false);
			login.show("�α���");
		}else if(e.getSource().equals(joinBtn)) {
			this.setVisible(false);
			join.show("ȸ������");
		}
	}
}//Ŭ���� ����
