package user;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {

	JFrame jf = new JFrame("¿À´ÃÀÇ ¿î¼¼");
	
	public Login(int gridNum){
		JPanel [] jp = new JPanel[gridNum];
		for(int i=0; i<jp.length; i++) {
			jp[i]=new JPanel();
			jf.add(jp[i]);
		}
		jf.setLayout(new GridLayout(gridNum, 1));
		jf.setBounds(200, 200, 300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
	}
	
	public void title(String title) { 
		JLabel jl = new JLabel(title);
	}
	public void text(String text) {
		JLabel jl = new JLabel(text);
		jf.add(jl);
	}
	public void tf(int size) {
		JTextField tf = new JTextField(size);
		jf.add(tf);
	}
	public void btn(String btn) {
		JButton jb = new JButton(btn);
		jf.add(jb);
	}
	
}
