package other;

public class p30 {
	public static void main(String[] args)
	{
		CarA car1;
		car1 = new CarA();
		try {
			car1.setCar(1234, -10.0);
		}
		catch(CarException e)
		{
			System.out.println("�ߥX"+e+"�F");
		}
		car1.show();
	}

}

class CarException extends Exception
{}
class CarA
{
	private int num;
	private double gas;
	
	public CarA()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�w���ͤF�T��");
	}
	
	public void setCar(int n, double g) throws CarException
	{
		if(g<0)
		{
			CarException e = new CarException();
			throw e;
		}else
		{
		num = n;
		gas = g;
		System.out.println("�N�T�����]��"+num+"�T���q�]��"+gas);
		}
		}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+num);
	}
	}