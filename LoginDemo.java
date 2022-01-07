package unit11;


import javax.swing.*;

public class LoginDemo extends JFrame{
	public LoginDemo() {
		setSize(500,500);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		//setBounds(50,50,80,20);
		JLabel usernameLabel=new JLabel("Username:");
		usernameLabel.setBounds(50,50,80,20);
		add(usernameLabel);
		JTextField usernameField=new JTextField();
		usernameField.setBounds(120,50,100,20);
		add(usernameField);
		
		//password feild
		JLabel passwordLabel=new JLabel("Password:");
		passwordLabel.setBounds(50,72,90,30);
		add(passwordLabel);
		JPasswordField passwordField=new JPasswordField();
		passwordField.setBounds(120,80,100,20);
		add(passwordField);
		setVisible(true);
		 
		//button field
		JLabel buttonLabel=new JLabel("Login");
		 JButton b=new JButton("Login"); 
		buttonLabel.setBounds(150,150,120,20);
		add(buttonLabel);
		JButton buttonField=new JButton();
		buttonField.setBounds(145,145,40,40);
		add(buttonField);
//		 JFrame f=new JFrame("Login");  
//		    JButton b=new JButton("Login");  
//		    b.setBounds(50,100,95,30);  
//		   f.add(b);  
//		    f.setSize(40,40);    
//		    f.setVisible(true); 
		
	}
	public static void main(String[] args) {
		new LoginDemo();
	}

}
