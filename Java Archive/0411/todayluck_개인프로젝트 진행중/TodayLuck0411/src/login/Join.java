package login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Join extends JFrame implements ActionListener{

	JPanel [] jp = new JPanel [6];
	
	public Join(){
		this.setLayout(new GridLayout(6,1));
		for(int i=0; i<jp.length; i++) {
			jp[i] = new JPanel();
			this.add(jp[i]);
		}
		jp[0].add(new JLabel("ȸ������"));
		jp[1].add(new JLabel("���̵�"));
		jp[1].add(new JTextField(8));
		jp[2].add(new JLabel("��й�ȣ"));
		jp[2].add(new JTextField(8));
		jp[3].add(new JLabel("�̸�"));
		jp[3].add(new JTextField(8));
		jp[4].add(new JLabel("�������"));
		jp[4].add(new JTextField(8));
		jp[5].add(new JButton("ȸ������"));
		jp[5].add(new JButton("�ڷΰ���"));
		MemberDTO mDTO = new MemberDTO();
		
		
		
		this.setBounds(500, 500, 300, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}//������ ����
	
	public void show(String title) {
		this.setVisible(true);
		this.setTitle(title);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}//Ŭ���� ����
