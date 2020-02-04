class FactorialTest
{
	void factorialFunction(double a)
	{
		int fact=1,i=1;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of "+i+" is :-"+fact);
		}
		System.out.println("Factorial of the "+(i-1)+" number is:-"+fact);
	}
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number to get factorial value:-");
		double a=sc.nextInt();
		new FactorialTest().factorialFunction(a);
	}
}
	