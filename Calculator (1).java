import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
 	JButton ad,sub,mul;
 	JTextField num1,num2,res;
 	JLabel heading;
 	Calculator()
	{
 		super("Vineet Abraham Koshy 69");
  		ad=new JButton("Add");
  		sub=new JButton("Sub");
  		mul=new JButton("Mul");
  		heading=new JLabel("Calculator");
  		num1=new JTextField(10);
  		num2=new JTextField(10);
  		res=new JTextField(10);
  		add(heading);
  		add(ad);
  		add(sub);
  		add(mul);
  		add(num1);
 		add(num2);
  		add(res);
  		setLayout(null);
  		ad.setBounds(125,10,75,200);
  		sub.setBounds(210,10,75,200);
  		mul.setBounds(305,10,75,200);
  		num1.setBounds(10,40,100,20);
  		num2.setBounds(10,70,100,20);
  		res.setBounds(10,150,100,20);
  		heading.setBounds(20,10,100,20);
  		setSize(500,300);
 		setVisible(true);
  		setDefaultCloseOperation(EXIT_ON_CLOSE);
 		ad.addActionListener(this);
  		sub.addActionListener(this);
  		mul.addActionListener(this);
 	}
  	public void actionPerformed(ActionEvent ae)
 	{
 		Object source=ae.getSource();
  		int n1,n2,result;
  		String strnum1=num1.getText();
  		n1=Integer.parseInt(strnum1);
  		n2=Integer.parseInt(num2.getText());
  		if(source==ad)
  		{
   			result=n1+n2;
   			res.setText(Integer.toString(result));
  		}
   		if(source==sub)
 		{
   			result=n1-n2;
   			res.setText(Integer.toString(result));
  		}
  		if(source==mul)
  		{
   			result=n1*n2;
   			res.setText(Integer.toString(result));
  		}
 		}
 		public static void main(String args[])
 		{
  			Calculator obj=new Calculator();
 		}
}

