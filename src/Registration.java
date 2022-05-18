import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.xml.transform.Templates;

public class Registration extends LoginForm {
	JLabel fullname,Email,PhoneNumber,confirmpassword,Reg;
	JTextField Tfullname,TEmail,TPhoneNumber;
	JPasswordField Tconfirmpassword;
	JButton btn1;
	JPanel panel1,panel2;
	Registration(){
		// LABELS
		fullname = new JLabel();
		Email = new JLabel();
		PhoneNumber = new JLabel();
		confirmpassword = new JLabel();
		Reg = new JLabel();
		//TEXTFIELD
		Tfullname = new JTextField();
		TEmail = new JTextField();
		TPhoneNumber = new JTextField();
		
		Tconfirmpassword = new JPasswordField();
		
		btn1 = new JButton();
		
		panel1 = new JPanel();
		panel2 = new JPanel();
	}
	
	public void header() {
		setLayout(new BorderLayout());
		add(panel1,BorderLayout.NORTH);
		panel1.setBackground(Color.yellow);
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel1.setPreferredSize(getPreferredSize());		
		Reg.setText("Registration");
		Reg.setFont(font);
		panel1.add(Reg);
	}
	public void registrationForm() {	
		// fullName and textfield_for_fullName
		fullname.setText("Full Name");
		fullname.setFont(new Font("Arial",Font.BOLD,15));
		fullname.setBounds(30,50,100,40);
		add(fullname);
		
		Tfullname.setFont(new Font("Arial",Font.BOLD,20));
		Tfullname.setBounds(30,100,180,30);
		add(Tfullname);
		
		// Email and textfield_for_Email
		Email.setText("Email");
		Email.setFont(new Font("Arial",Font.BOLD,20));
		Email.setBounds(30,130,60,40);
		add(Email);
		
		TEmail.setFont(new Font("Arial",Font.BOLD,20));
		TEmail.setBounds(30,180,180,30);
		add(TEmail);
		
		// userName and textfield_for_userName
		username.setText("Username");
		username.setFont(new Font("Arial",Font.BOLD,20));
		username.setBounds(300,50,100,40);
		add(username);

		Tusername.setFont(new Font("Arial",Font.BOLD,20));
		Tusername.setBounds(300,100,180,30);
		add(Tusername);
		
		// phoneNumber and textfield_for_phoneNumber
		PhoneNumber.setText("Phone Number");
		PhoneNumber.setFont(new Font("Arial",Font.BOLD,20));
		PhoneNumber.setBounds(300,130,140,40);
		add(PhoneNumber);
		
		TPhoneNumber.setFont(new Font("Arial",Font.BOLD,20));
		TPhoneNumber.setBounds(300,180,180,30);
		add(TPhoneNumber);
		
		// Password and textfield_for_Password
		password.setText("Password");
		password.setFont(new Font("Arial",Font.BOLD,20));
		password.setBounds(30,210,100,40);
		add(password);
		
		Tpassword.setFont(new Font("Arial",Font.BOLD,20));
		Tpassword.setBounds(30,260,180,30);
		add(Tpassword);
		
		// confirmPassword and confirmPassword
		confirmpassword.setText("Conform Password");
		confirmpassword.setFont(new Font("Arial",Font.BOLD,20));
		confirmpassword.setBounds(300,210,200,40);
		add(confirmpassword);
		
		Tconfirmpassword.setFont(new Font("Arial",Font.BOLD,20));
		Tconfirmpassword.setBounds(300,260,180,30);
		add(Tconfirmpassword);
		
		// button
		btn1.setText("Submit");
		btn1.setFont(new Font("Arial",Font.BOLD,20));
		btn1.setBounds(180,360,100,30);
		add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		
	}
}


