import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class Guiprogram extends JFrame implements ActionListener
{
	JButton ad;
	JTextField num1,num2,num3,num4,num5;
	JLabel heading,h1,h2,h3,h4;
	Guiprogram()
	{
	super("Vineet Abraham Koshy 69");
	ad=new JButton("Find ");
	heading=new JLabel("SEARCH MOVIE !!! ");
	h1=new JLabel("Director ");
	h2=new JLabel("Year ");
	h3=new JLabel("collection ");
	h4=new JLabel("Language ");
	num1=new JTextField(10);
	num2=new JTextField(10);
	num3=new JTextField(10);
	
	num4=new JTextField(10);
	num5=new JTextField(10);
	add(heading);
	add(h1);
	add(h2);
	add(h3);
	add(h4);
	add(ad);
	
	add(num1);
	add(num2);
	add(num3);
	add(num4);
	add(num5);
	setLayout(null);
	ad.setBounds(10,70,100,20);

	num1.setBounds(10,40,100,20);
	num2.setBounds(250,40,100,20);
	num3.setBounds(250,80,100,20);
	num4.setBounds(250,120,100,20);
	num5.setBounds(250,160,100,20);
	heading.setBounds(20,10,100,20);
	
	h1.setBounds(250,20,100,20);
	h2.setBounds(250,60,100,20);
	h3.setBounds(250,100,100,20);
	h4.setBounds(250,140,100,20);
	
	setSize(500,300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	ad.addActionListener((this));
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		try {
		int numrows=0;
		int yr;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","password");
		Statement stm =con.createStatement();
		String qry="select * from movies  ";
		ResultSet rs=stm.executeQuery(qry);
		while(rs.next())
		{
		if (rs.getString(1).equals(num1.getText()))
		{
		//num2.setText(rs.getString(1));
		num2.setText(rs.getString(2));
		num3.setText(rs.getString(3)); 
		num4.setText(rs.getString(4)); 
		num5.setText(rs.getString(5));   
		numrows++;
		}
		}
		if (numrows>0)
		{
		System.out.println(numrows+"rows retreived");
		}
		else{
		System.out.println("Data not Found");
		}
		rs.close();
		stm.close();
		con.close();
		}
		catch(ClassNotFoundException e)
		{
		System.out.println(e);
		}
		catch(SQLException e)
		{
		System.out.println(e);
		}
	}
	public static void main(String args[])
	{
	Guiprogram obj=new Guiprogram();
	}
}
