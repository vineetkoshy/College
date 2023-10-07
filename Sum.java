import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class Sum extends JFrame implements ActionListener
{
	JButton search;
	JTextField sum,fname;
	JLabel heading,fn,summm;
	Sum()
	{
		super("WORD COUNTER");
		heading = new JLabel("WORD SEARCH");
		fn = new JLabel("Enter Filename:");
		fname = new JTextField(20);
		search = new JButton("SEARCH");
		sum = new JTextField(20);
		summm = new JLabel("SUM:");
		add(heading);
		add(fn);
		add(fname);
		add(search);
		add(sum);
		add(summm);
		setLayout(null);
		heading.setBounds(30,10,120,20);
		fn.setBounds(10,30,120,20);
		fname.setBounds(140,30,100,20);
		search.setBounds(50,70,100,40);
		summm.setBounds(10,120,120,20);
		sum.setBounds(140,120,100,20);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		search.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int count=0,n;
			String f;
			f=fname.getText();
			FileReader fin = new FileReader(f);
			Scanner fscan = new Scanner(fin);
			while(fscan.hasNextInt()==true)
			{
				n=fscan.nextInt();
				if(n%2!=0)
				{
					count+=n;
				}
			}
 			fscan.close();
 			fin.close();
 			sum.setText(Integer.toString(count));
 		}
 		catch(IOException e)
 		{
 			System.out.println(e);
 		}
	}
	public static void main(String args[])
	{
		Sum obj = new Sum();
	}
}
