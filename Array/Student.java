import java.util.*;
class Student
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int rNo=0;
		String name;
		Student arr[]=new Student[5];
		System.out.println("Enter the number of elements:");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the elements");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}

	
	