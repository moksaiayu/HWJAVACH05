package other;

public class p50 {
	public static void main(String[] args)
	{
		CarG car1 = new CarG("1����");
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class CarG implements Runnable
{
	private String name;
	
	public CarG(String nm)
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
