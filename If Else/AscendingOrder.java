/*Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.*/

class AscendingOrder
{
	public static void main(String args[])
	{
		int a=20,b=40,c=30;
		if(c>b && b>a)
		{
			System.out.println("Icreasing order");
		}
		else if(a>b && b>c)
		{
			System.out.println("Decreasing order");
		}
		else
		{
			System.out.println("Neither increasing or decreasing order");
		}
	}
}