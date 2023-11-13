	import javax.swing.*;
	import java.awt.*;
	public class SwingExample  extends JFrame {
	JTextField txtName,txtPass;
	JLabel lblName, lblPass;
	JButton cmdOk,cmdCancel;
	public SwingExample()
	{
	txtName=new JTextField(10);
	txtPass =new JTextField(10);
	lblName=new JLabel("User Name");
	lblPass =new JLabel("Password");
	cmdOk =new JButton("Ok");
	cmdCancel=new JButton("Cancel");
	
	Container con=getContentPane();
	con.setLayout(new FlowLayout());
	con.add(lblName); con.add(txtName);
	con.add(lblPass); con.add(txtPass);
	con.add(cmdOk); con.add(cmdCancel);
	
	}

	public static void main(String args[]) {

		SwingExample l=new SwingExample();
	l.setSize(150,200);
	l.setVisible(true);
	}
	}
