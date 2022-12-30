package gui_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener {
	JButton btn1, btn2;
	JLabel lbl;

	public ButtonListener(JButton btn1, JButton btn2, JLabel lbl) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.lbl = lbl;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ImageIcon icon = null;
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

}
