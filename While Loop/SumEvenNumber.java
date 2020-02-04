//Write a C program to find sum of all even numbers between 1 to n.

class SumEvenNumber
{
	public static void main(String args[])
	{
		int num=0,sum=0;
		while(num<=10)
		{
			num=num+2;
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
	}
}