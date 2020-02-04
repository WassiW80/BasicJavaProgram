class Fibo
{
	public static void main(String args[])
	{
		int num=6,i=1,fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}