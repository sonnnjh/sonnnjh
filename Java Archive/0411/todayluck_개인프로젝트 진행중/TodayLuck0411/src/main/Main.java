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
	JLabel title1 = new JLabel("오늘의 운세");
	JButton loginBtn = new JButton("로그인");
	JButton joinBtn = new JButton("회원가입");
	
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
	}//생성자 종료
	
	public static void main(String[] args) {
		new Main("오늘의 운세");
	}//프로그램 종료

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(loginBtn)) {
			this.setVisible(false);
			login.show("로그인");
		}else if(e.getSource().equals(joinBtn)) {
			this.setVisible(false);
			join.show("회원가입");
		}
	}
}//클래스 종료
