import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {
	 JLabel Login,username,password,icon;
	 JTextField Tusername;
	 JPasswordField Tpassword;
	 JButton btnLogin,btnRegistration;
	 Font font;
	 
	 LoginForm(){
		 Login = new JLabel();
		 username = new JLabel();
		 password = new JLabel();
		 Login = new JLabel();
		 icon = new JLabel();
		 
		 Tusername = new JTextField();
		 Tpassword = new JPasswordField();
		 
		 btnLogin = new JButton();
		 btnRegistration = new JButton();
		 
		 font = new Font("Arial",Font.BOLD,20);
	 }
	 
	 public void frame(int width,int height) {
		 // frame properties define 
		 setTitle("Quiz Management Application");
		 setSize(width,height);
		 setLayout(null);
		 setLocation(400, 150);
		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 setVisible(true);	 
		 setResizable(false);
	 }
	 
	 public void Desgin() {
		 //icon setup
		 add(icon);
		 ImageIcon c1 = new ImageIcon("C:\\Users\\samsung\\Downloads\\pic.png");
		 icon.setIcon(c1);
		 icon.setBounds(0, 0,100,100);
		 
		 //login Label
		Login.setText("Login");
		add(Login);
		Login.setBounds(200, 0,100,100);
		Login.setFont(font);

		//User_name and textfield_for_username
		username.setText("Username");
		add(username);
		username.setBounds(80, 100,100,100);
		username.setFont(font);
		
		add(Tusername);
		Tusername.setBounds(210, 135,180,30);
		Tusername.setFont(font);
		
		//password and text_field password
		password.setText("Password");
		add(password);
		password.setBounds(80, 150,100,100);
		password.setFont(font);
		
		add(Tpassword);
		Tpassword.setBounds(210, 185,180,30);
		
	}
	public void button() {
		// Login Button
		add(btnLogin);
		btnLogin.setText("Login");
		btnLogin.setBounds(180, 280,100,40);
		btnLogin.setFont(font);
		btnLogin.setBackground(new Color(32,178,170));
		btnLogin.setForeground(Color.white);
		btnLogin.setBorder(null);
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				WelcomeToQuiz quiz = new WelcomeToQuiz();
				quiz.frame(600,550);
				quiz.open();
				quiz.action();
			}
		});

		// Registration Button
		add(btnRegistration);
		btnRegistration.setText("Registration");
		btnRegistration.setBounds(300, 280,130,40);
		btnRegistration.setFont(font);
		btnRegistration.setBackground(new Color(32,178,170));
		btnRegistration.setForeground(Color.white);
		btnRegistration.setBorder(null);
		
		btnRegistration.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Registration  r1 = new Registration();
				
				r1.frame(520,500);
				r1.registrationForm();
				r1.header();
			}
		});
		
}
	public static void main(String[] args) {
		LoginForm l1 = new LoginForm();
		l1.frame(500,400);
		l1.Desgin();
		l1.button();
}
}