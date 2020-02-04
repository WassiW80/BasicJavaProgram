class Mix
{
	public static void main(String args[])
	{
		int a=2,count=0,num=150,n=10;
		switch(a)
		{
			case 1:
				
				while(n<=100)
				{
					if(n%2!=0)
					count++;
					n++;
				}
				System.out.println(count);
			break;
			case 2:
				for(int i=100;i<300;i++)
				{
					if(num==i)
					{
						System.out.println("number is available "+num);
					}
				}
			break;
			default:
				System.out.println("ERROR");
		}
	}
}