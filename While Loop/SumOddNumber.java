//Write a C program to find sum of all odd numbers between 1 to n.

class SumOddNumber
{
	public static void main(String args[])
	{
		int num=1,sum=0;
		while(num<=10)
		{
			num=num+2;
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
	}
}