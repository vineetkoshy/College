import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class MovieDelete extends JFrame implements ActionListener
{
	JButton b1;
	JLabel l1,l2;
	JTextField t1;
	MovieDelete()
	{
		super("Movie Data Deletion");
		l1= new JLabel("Enter Movie");
		t1= new JTextField(20);
		b1= new JButton("Delete");
		l2= new JLabel("");
		
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		
		setLayout(null);
		l1.setBounds(150,20,200,40);
		t1.setBounds(165,50,90,20);
		b1.setBounds(160,80,100,25);
		l2.setBounds(155,110,200,40);
		
		
		setSize(500,300);
		setVisible(true);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{	String mdd=t1.getText();
					
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","password");	
			Statement stm=con.createStatement();
			String qry="delete from movie where NAME='"+mdd+"'";
			int count=stm.executeUpdate(qry);
			if(count>0)
			{
				l2.setText("Movie Data Deleted");
				
			}
			else
			{
				l2.setText("Deletion Failed");
			}
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
		MovieDelete del=new MovieDelete();
		
	}
	
	
	
	
}
