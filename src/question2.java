import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class question2 extends JavaQuiz {
	
	public void q2() {
		l1.setText("Who \n");
		l1.setBounds(40,60, 200, 50);
		l1.setFont(font);
		
		p5.add(p6);
		p6.setBackground(Color.blue);
		p5.add(r1);
		p5.add(r2);
		p5.add(r3);
		p5.add(r4);
		r1.setBounds(40,120,50,50);
		r2.setBounds(40,160,50,50);
		r3.setBounds(40,200,50,50);
		r4.setBounds(40,240,50,50);
		
	}

}
