import java.util.*;
import java.io.*;
class ATM
{
	Scanner scan = new Scanner(System.in);
	void startAccount()
	{
 	       try
	{
   		System.out.println("Vineet Koshy 69 Bank\nEnter Account No:");
  		int accno = scan.nextInt();
   		FileWriter fout = new FileWriter(accno+".txt");
                System.out.println("Enter Initial Balance");
   		int bal = scan.nextInt();
                fout.write(Integer.toString(bal));
    		fout.close();
 		System.out.println("Account Created!");
        }
        catch(IOException e)
 	{
       		System.out.println(e);
 	}
}
void deposit()
{
	try
 	{
   		int i,bal=0;
  		System.out.println("Vineet Koshy 69 Bank\nEnter Account No:");
   		int accno = scan.nextInt();
   		System.out.println("Vineet Koshy 69 Bank\nEnter Deposit Amount :");
   		int damt = scan.nextInt();
   		FileReader fin = new FileReader(accno+".txt");
   		Scanner fscan=new Scanner(fin);
     		bal=fscan.nextInt();
   		bal=bal+damt;
   		FileWriter fout = new FileWriter(accno+".txt");
   		fout.write(Integer.toString(bal));
     		fin.close();
     		fout.close();
     		System.out.println("Deposit added Succesfully");
        }
        catch(IOException e)
 	{
          	System.out.println(e);
   	}
}
void withdraw()
{
 	try
 	{
  		int bal=0;
   		System.out.println("Uday Bank\nEnter Account No:");
   		int accno = scan.nextInt();
   		System.out.println("Uday Bank\nEnter Withdraw Amount :");
  		int damt = scan.nextInt();
   		FileReader fin = new FileReader(accno+".txt");
   		Scanner fscan=new Scanner(fin);
     		bal=fscan.nextInt();
   		if(bal<damt)
   		{
      			System.out.println("\nNot enought balance\n");
     
   		}
   		else  
      			bal=bal-damt;
   			FileWriter fout = new FileWriter(accno+".txt");
   			fout.write(Integer.toString(bal));
     			fin.close();
     			fout.close();
     			System.out.println("\nAmount Withdrawn Succesfully\n");
   	}
        catch(IOException e)
 	{
          	System.out.println(e);
   	}
}
void checkBalance()
{
 	try
 	{
   		int bal=0;
   		System.out.println("Vineet Koshy 69 Bank\nEnter Account No:");
   		int accno = scan.nextInt();
   		FileReader fin = new FileReader(accno+".txt");
   		Scanner fscan=new Scanner(fin);
    		bal=fscan.nextInt();
   		System.out.println("\nBalance is : "+bal);  
     		fin.close();
   	}
        catch(IOException e)
 	{
          	System.out.println(e);
   	}
}
}
class ATMDemo
{
	public static void main(String args[])
	{
		int ch;
		Scanner scan = new Scanner(System.in);
		ATM obj = new ATM();
		while(true)
		{
			System.out.println("Enter choice\nOpt 1 for Creating account\nOpt 2 for Depositing money\nOpt 3 for Withdrawing Money\nOpt 4 to Check your Balance");
			ch = scan.nextInt();
			switch(ch)
			{
				case 1: obj.startAccount();
				break;
				case 2:obj.deposit();
				break;
				case 3: obj.withdraw();
				break;
				case 4: obj.checkBalance();
				break;
				default:System.exit(0);
				break;
			}
		}
	}
}
