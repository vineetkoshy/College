import java.sql.*;
import java.util.*;
class ThirdQuestion
{
	public static void main(String args[])
	{
		System.out.println("Vineet Abraham Koshy 69");
		System.out.println("CSC C");
		try
		{
			int numrows=0;
			int yr;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","password");
			Statement stm=con.createStatement();
			String qry="select * from movies order by year desc";
			ResultSet rs=stm.executeQuery(qry);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter The Year :");
			yr=scan.nextInt();
			while(rs.next())
			{
				if(rs.getDouble(3)==yr)
				{
				System.out.println(rs.getString(1)+'\t'+rs.getString(2)+'\t'+rs.getInt(3)+'\t'+rs.getDouble(4)+'\t'+rs.getString(5));
				numrows++;
				}
			}
			if(numrows>0)
			{
				System.out.println(numrows+"rows retriveved!");
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
}
