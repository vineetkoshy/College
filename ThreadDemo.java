class EvenThread implements Runnable
{
	EvenThread()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Even Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Even Thread Interrupted.");
		}
		System.out.println("Even Thread Exiting.");
	}
}

class OddThread implements Runnable
{
	OddThread()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Odd Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Odd Thread Interrupted.");
		}
		System.out.println("Odd Thread Exiting.");
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		EvenThread evobj = new EvenThread();
		OddThread odobj = new OddThread();
	}
}
