package login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	JPanel [] jp = new JPanel [4];
	
	public Login(){
		this.setLayout(new GridLayout(4, 1));
		for(int i=0; i<jp.length; i++) {
			jp[i] = new JPanel();
			this.add(jp[i]);
		}
		jp[0].add(new JLabel("로그인"));
		jp[1].add(new JLabel("아이디"));
		jp[1].add(new JTextField(8));
		jp[2].add(new JLabel("비밀번호"));
		jp[2].add(new JTextField(8));
		jp[3].add(new JButton("로그인"));
		jp[3].add(new JButton("뒤로가기"));
		
		this.setBounds(500, 500, 300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	public void show(String title) {
		this.setVisible(true);
		this.setTitle(title);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	//db에서 회원 가지고 와서 매칭하기
}
