class Operation
{
	static double withdrawAmount(double withdraw)
	{
		double amount=10000;
		amount = amount-withdraw;
		return amount;
	}
	static double depositAmount(double deposit)
	{
		double amount=10000;
		amount = amount-deposit;
		return amount;
	}
	static double areaOfCircle(double radius)
	{
		double area=0;
		final double pi=3.14;
		area=pi*radius*radius;
		return area;
	}
	static double areaOfTriangle(double base,double height)
	{
		double area=0;
		area=(base*height)/2;
		return area;
	}
	static void oddEven(int num)
	{
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	static int factorial(int num)
	{
		int fact=1,i=1;
		while(i<=num)
		{
			fact=fact*num;
			num--;
		}
	return fact;
	}
}

class TestFunctions
{
	public static void main(String args[])
	{
		double withdraw=Operation.withdrawAmount(1000);		//...Data Handling
		double deposit=Operation.depositAmount(2000);
		double area_c=Operation.areaOfCircle(5);
		double area_t=Operation.areaOfTriangle(5,4);
		int fact=Operation.factorial(5);
		new Operation().oddEven(5);
		System.out.println("Amount after withdrawal:-" +withdraw);
		System.out.println("Amount after Deposit:-" +deposit);
		System.out.println("Area of circle:-" +area_c);
		System.out.println("Area of triangle:-" +area_t);
		System.out.println("Factorial:-"+fact);
		
	}
}