//Find Sum of Natural Numbers

class Natural
{
	public static void main(String args[])
	{
		int num=10,sum=0,i=0;
		while(i<=num)
		{
			sum=i+sum;
			i++;
		}
		System.out.println(sum);
	}
}
