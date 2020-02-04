/*Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.*/

class EqualNumber
{
	public static void main(String args[])
	{
		int a=20,b=10,c=30;
		if(a==b && a==c)
		{
			System.out.println("All number are equals");
		}
		else if(a!=b && a!=c && b!=c)
		{
			System.out.println("All number are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}
	}
}