class Fact
{
	public static void main(String args[])
	{
		int num=6,i=1,fact=1;
		while(i<=num)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);		
	}
}