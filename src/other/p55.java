package other;

public class p55 {
	public static void main(String[] args)
	{
		CompanyA cmp = new CompanyA();
		
		DriverA drv1 = new DriverA(cmp);
		drv1.start();
		
		DriverA drv2 = new DriverA(cmp);
		drv2.start();
}
}
class CompanyA
{
	private int sum = 0;
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("�ثe���X�p���B"+tmp+"��");
		System.out.println("�Ȩ�"+tmp+"���F");
		tmp = tmp + a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum = tmp;
	}
}
class DriverA extends Thread
{
	private CompanyA comp;
	public DriverA(CompanyA c) {
		comp = c;
	}
	public void run() {
		for(int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}
	}