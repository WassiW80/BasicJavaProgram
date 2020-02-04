class UserInput
{
	java.util.Scanner scan=new java.util.Scanner(System.in);
	void insertData()
	{
		System.out.println("Enter the size of array:-");
		int num=scan.nextInt();
		int a[]=new int[num];
		System.out.println("Enter "+num+" elements:");
		for(int i=0;i<num;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<num;i++)
	System.out.println("The elements at loctaion a["+i+"] is :- "+a[i]);
	}
	public static void main(String args[])
	{
		new UserInput().insertData();
	}
}

			