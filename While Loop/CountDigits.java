//Write a C program to count number of digits in a number.

class CountDigits
{
	public static void main(String args[])
	{
		int count=0,num=246;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}