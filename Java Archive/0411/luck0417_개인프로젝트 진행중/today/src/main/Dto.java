package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dto {
	public JFrame jf = new JFrame("오늘의 운세");
	public JPanel [] jp = new JPanel[6];
	public JLabel title = new JLabel("오늘의 운세");
	public JLabel id = new JLabel("아이디");
	public JLabel pw = new JLabel("비밀번호");
	public JLabel text3 = new JLabel("이름");
	public JLabel text4 = new JLabel("생년월일");
	public JTextField tf = new JTextField(7);
	public JTextField tf2 = new JTextField(7);
	public JTextField tf3 = new JTextField(7);
	public JTextField tf4 = new JTextField(7);
	public JButton btn = new JButton("로그인");
	public JButton btn2 = new JButton("회원가입");

	public void dto1() { //jpanel추가
		jf.setLayout(new GridLayout(6,1));
		for(int i=0; i<jp.length; i++) {
			jp[i]=new JPanel();
			jf.add(jp[i]);
		}
	}
	public void dto2() { //jframe 세팅
		jf.setBounds(300, 300, 300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
	public void show() {
		jf.setVisible(true); //창 보이기
	}
	
}//class종료
