import java.util.*;
import java.sql.*;
class DelMov
{
	public static void main(String args[])
	{	
		System.out.println("Vineet Abraham Koshy 69");
		System.out.println("CSC C");
		try
		{
			int numr=0;
			String yr;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","password");
			Statement stm=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the year");
			yr=sc.next();
			String qry1="delete  from movies where year<"+yr;
			stm.executeUpdate(qry1);
			System.out.println("Query Ok!");
			qry1="select * from movies order by year desc";
			ResultSet rs=stm.executeQuery(qry1);
			
			while(rs.next())
			{
					System.out.println("Movie"+rs.getString(1)+'\n'+"Director:"+rs.getString(2)+"\n"+"Year:"+rs.getInt(3)+'\n'+"Collection:"+rs.getInt(4)+"\n"+"Language:"+rs.getString(5));
					System.out.println("********************");
					numr++;
			}
			if(numr>0)
			{
				System.out.println("The movies were retrieved");
			}
			else
			{
				System.out.println("The movies were not retrieved");
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

