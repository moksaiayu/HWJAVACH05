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
			System.out.println("拋出"+e+"了");
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
		System.out.println("已產生了汽車");
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
		System.out.println("將汽車號設為"+num+"汽車量設為"+gas);
		}
		}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+num);
	}
	}