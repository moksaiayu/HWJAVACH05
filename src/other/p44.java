package other;

public class p44 {
	public static void main(String[] args)
	{
		CarB car1 = new CarB("1����");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class CarB extends Thread
{
	private String name;
	public CarB(String nm)
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