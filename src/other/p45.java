package other;

public class p45 {
	public static void main(String[] args)
	{
		CarC car1 = new CarC("1����");
		car1.start();
		
		CarC car2 = new CarC("2����");
		car2.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class CarC extends Thread
{
	private String name;
	
	public CarC(String nm)
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
