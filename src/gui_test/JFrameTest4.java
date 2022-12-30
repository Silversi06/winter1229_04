package gui_test;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//3.Anoymous(익명) 클래스로 ActionListener를 구현
public class JFrameTest4 extends JFrame{
	
	ImageIcon icon = new ImageIcon("Saved Pictures/KakaoTalk_20220320_040311101.jpg");
	JLabel lbl = new JLabel(icon,JLabel.CENTER);
	JButton btn1 = new JButton("Ive");
	JButton btn2 = new JButton("Black Pink");
	JButton btn3 = new JButton("New Jeans");
	
	public JFrameTest4() {
		JPanel pan = new JPanel();
		

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
		new JFrameTest4();

	}
	
	ActionListener btnListener = new ActionListener() {
		@Override 
		public void actionPerformed(ActionEvent e) {
			Object btnSource = e.getSource();		
			if(btnSource==btn1) {
				icon=new ImageIcon("Saved Pictures/263MBCDUNQ_1.jpg");
			}else if(btnSource==btn2) {
				icon=new ImageIcon("Saved Pictures/다운로드.jpg");
			}else {
				icon=new ImageIcon("Saved Pictures/c9f999b5-d32d-4a06-bdfc-02aff4755ffb.jpg");
			}
			lbl.setIcon(icon);
		}
	};
}
