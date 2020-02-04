//Write a C program to find sum of all natural numbers between 1 to n.

class SumNaturalNumber
{
	public static void main(String args[])
	{
		int num=1,sum=0;
		while(num<=10)
		{
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
	}
}