package main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dto {
	public JFrame jf = new JFrame("������ �");
	public JPanel [] jp = new JPanel[6];
	public JLabel title = new JLabel("������ �");
	public JLabel id = new JLabel("���̵�");
	public JLabel pw = new JLabel("��й�ȣ");
	public JLabel text3 = new JLabel("�̸�");
	public JLabel text4 = new JLabel("�������");
	public JTextField tf = new JTextField(7);
	public JTextField tf2 = new JTextField(7);
	public JTextField tf3 = new JTextField(7);
	public JTextField tf4 = new JTextField(7);
	public JButton btn = new JButton("�α���");
	public JButton btn2 = new JButton("ȸ������");

	public void dto1() { //jpanel�߰�
		jf.setLayout(new GridLayout(6,1));
		for(int i=0; i<jp.length; i++) {
			jp[i]=new JPanel();
			jf.add(jp[i]);
		}
	}
	public void dto2() { //jframe ����
		jf.setBounds(300, 300, 300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
	public void show() {
		jf.setVisible(true); //â ���̱�
	}
	
}//class����
