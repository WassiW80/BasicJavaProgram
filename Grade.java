class Grade
{
	public static void main(String args[])
	{
		
		int total,out_of;

		total=445;
		out_of=500;
		
		double percentage=total*100/out_of;
		System.out.println(percentage);
	
		if(percentage>=80)
		{
			System.out.println("Merit");
		}
		else if(percentage>=75)		
		{
			System.out.println("Distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("First class");
		}
		else
		{
			System.out.println("Second class");
		}
	}
}