class Circle 
{
	double rad;
	double areaCircle(double rad)
	{
		this.rad=rad;
		return (3.14*rad*rad);
	}
}
class Business
{
	int x;
	Business()
	{
		this(100);
		System.out.println("DEFAULT:");
	}
	Business(int x)
	{
		this.x=x;
		this.display(400);
	}
	void display(int x)
	{
		System.out.println(this.x);
	}
}
class ThisCircleTest
{
	public static void main(String args[])
	{
		Business b=new Business();
		Circle cr=new Circle();
		double result=cr.areaCircle(2.5);
		System.out.println("Area of Circle:"+result);
	}
}
 