import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
class word extends JFrame implements ActionListener
{
    JButton book;
    JTextField n1,n2;
    JLabel h1,h2,res;
    word()
    {
        super("Vineet Abraham Koshy 69");
        book=new JButton("Search");
        h1= new JLabel("File Name:");
        h2= new JLabel("Word:");
        res= new JLabel("");
        n1=new JTextField(30);
        n2=new JTextField(30);
        add(h1);
        add(h2);
        add(res);
        add(book);
        add(n1);
        add(n2);
        setLayout(null);
        book.setBounds(10,150,120,25); 
        n1.setBounds(10,110,260,25);
        n2.setBounds(10,250,260,25);
        h1.setBounds(10,80,150,20);
        h1.setFont(new Font("Verdana", Font.PLAIN, 16));
        h2.setBounds(10,220,1500,20);
        h2.setFont(new Font("Verdana", Font.PLAIN, 16));
        res.setBounds(10,290,12000,25);
        res.setFont(new Font("Verdana", Font.PLAIN, 16));
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        book.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {   
    	try
       {
       int c=0;
        String s1,s2;
        s1=n1.getText();
        s2=n2.getText();
        FileReader fin =new FileReader(s1+".txt");
	Scanner fscan=new Scanner(fin);
	while(fscan.hasNext()==true)
	{
	String s=fscan.next();
	if(s.equalsIgnoreCase(s2))
	{
	c++;
	}
	res.setText(Integer.toString(c));
	}
	}
	catch(IOException e)
	{
	 System.out.println(e);
	}
     }
    public static void main(String args[])
    {
        word obj=new word();
    }
}


