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
		jp[0].add(new JLabel("�α���"));
		jp[1].add(new JLabel("���̵�"));
		jp[1].add(new JTextField(8));
		jp[2].add(new JLabel("��й�ȣ"));
		jp[2].add(new JTextField(8));
		jp[3].add(new JButton("�α���"));
		jp[3].add(new JButton("�ڷΰ���"));
		
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
	//db���� ȸ�� ������ �ͼ� ��Ī�ϱ�
}
