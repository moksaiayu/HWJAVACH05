package other;

public class p46 {
	public static void main(String[] args)
	{
		CarD car1 = new CarD("1����");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class CarD extends Thread
{
	private String name;
	
	public CarD(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				sleep(1000);
				System.out.println("���b�i��"+name+"���B�z�u�@");
			}
			catch(InterruptedException e)
			{}
		}
	}
}
