package manager;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManagerLogin extends JFrame implements ActionListener{
	JPanel [] jp = new JPanel [4];
	JLabel title1 = new JLabel("관리자");
	JButton loginBtn = new JButton("로그인"); 
	JButton joinBtn = new JButton("회원가입"); 
	
	ManagerLogin(){
		this.setLayout(new GridLayout(4, 1));
		for(int i=0; i<jp.length; i++) {
			jp[i]=new JPanel();
			this.add(jp[i]);
		}
		jp[1].add(title1);
		jp[2].add(loginBtn);
		jp[2].add(joinBtn);
		
		this.setBounds(500, 500, 300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ManagerLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		if(e.getSource().equals(loginBtn)) {
			
		}else if(e.getSource().equals(joinBtn)) {
			
		}
	}

}
