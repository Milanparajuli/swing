package unit11;
import javax.swing.*;
public class HelloWorldDemo {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setTitle("Hello from Swing");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	JLabel helloLebel=new JLabel("Hello World!");
	helloLebel.setBounds(100,100,80,50);
	frame.add(helloLebel);
	frame.setVisible(true);

}
}
