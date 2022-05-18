import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.Subject;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class WelcomeToQuiz extends LoginForm {
	JLabel header,subject_HL,subject_DLD,subject_OS,subject_MATH;
	JButton HL,DLD,OS,Mathematics;
	WelcomeToQuiz(){
		header = new JLabel();
		HL = new JButton();
		DLD = new JButton();
		OS = new JButton();
		Mathematics = new JButton();
		subject_HL = new JLabel();
		subject_DLD = new JLabel();
		subject_OS = new JLabel();
		subject_MATH = new JLabel();
		}
	
	public  void  open() {
		header.setText("Welcome to Quiz");
		header.setBounds(150, 5, 300, 100);
		header.setFont(new Font("Arial",Font.BOLD,30));
		add(header);
		
		ImageIcon j = new ImageIcon("D:\\Quiz Management System\\picture\\Java-icon.png");
		HL.setIcon(j);
		HL.setBounds(140,120,120,120);
		add(HL);
		
		subject_HL.setText("JAVA");
		subject_HL.setBounds(165,235,50,50);
		subject_HL.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_HL);
		
		
		ImageIcon d = new ImageIcon("D:\\Quiz Management System\\picture\\dld.png");
		DLD.setIcon(d);
		DLD.setBackground(Color.white);
		DLD.setBounds(330,120,120,120);
		add(DLD);
		DLD.setBackground(Color.white);
		 
	
		subject_DLD.setText("DLD");
		subject_DLD.setBounds(365,235,50,50);
		subject_DLD.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_DLD);
		
		ImageIcon o = new ImageIcon("D:\\Quiz Management System\\picture\\window.png");
		OS.setIcon(o);
		OS.setBounds(140,300,120,120);
		add(OS);
        
		subject_OS.setText("OS");
		subject_OS.setBounds(165,415,50,50);
		subject_OS.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_OS);
		
		ImageIcon pic = new ImageIcon("D:\\Quiz Management System\\picture\\math.png");
		Mathematics.setIcon(pic);
		Mathematics.setBounds(330,300,120,120);
		add(Mathematics);
		Mathematics.setBackground(Color.white);
		
		subject_MATH.setText("Math");
		subject_MATH.setBounds(365,415,50,50);
		subject_MATH.setFont(new Font("Arial",Font.BOLD,20));
		add(subject_MATH);
	}
	public void action() {
		HL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JavaQuiz j1 = new JavaQuiz();
				j1.frame(500, 500);
				j1.Q1();
				j1.Q2();
				j1.answer();
			}
		});
	}
	public static void main(String[] args) {


}
}
