package other;

public class p48 {
	public static void main(String[] args)
	{
		CarF car1 = new CarF("1����");
		car1.start();
		
			try {
				car1.join();
			}
			catch(InterruptedException e)
			{}
			System.out.println("����main()���B�z�u�@�C");
	
}
}

class CarF extends Thread
{
	private String name;
	
	public CarF(String nm)
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
