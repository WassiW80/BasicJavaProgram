class ArrayOdd
{
	static void odd()
	{
		String name[]=new String[]{"Wassi","Muhib","Aparna","Mahesh","Chinmay","Sahil","Pallavi","Amaan","Ayaan","Azlaan"};
		for(int i=0;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Name at location "+i+" :- "+name[i]);
			}
		}
	}
	public static void main(String args[])
	{
		odd();
	}
}