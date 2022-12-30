package gui_test;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//Inner(내부) 클래스로 ActionListener를 구현
public class JFrameTest5 extends JFrame{
	
	
	//4.독립된 ActionListener 클래스를 사용하자.
	ImageIcon icon = new ImageIcon("Saved Pictures/KakaoTalk_20220320_040311101.jpg");
	JLabel lbl = new JLabel(icon,JLabel.CENTER);
	JButton btn1 = new JButton("Ive");
	JButton btn2 = new JButton("Black Pink");
	JButton btn3 = new JButton("New Jeans");
	
	public JFrameTest5() {
		JPanel pan = new JPanel();
		ButtonListener btnListener = new ButtonListener(btn1,btn2,lbl);

		btn1.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		btn3.addActionListener(btnListener);
		pan.add(btn1);pan.add(btn2);pan.add(btn3);
		add(pan,"North");
		
		add(lbl,"Center");
		setTitle("JFrame 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200,200);
		setSize(500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameTest5();

	}
}
