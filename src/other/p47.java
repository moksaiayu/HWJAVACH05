package other;

public class p47 {
	public static void main(String[] args)
	{
		CarE car1 = new CarE("1����");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("���b�i��main()���B�z�u�@");
			}
			catch(InterruptedException e)
			{}
	}
}
}

class CarE extends Thread
{
	private String name;
	
	public CarE(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
				System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}
