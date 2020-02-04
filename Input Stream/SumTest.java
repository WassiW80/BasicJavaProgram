import java.util.*;
class SumTest
{
	
	void inputArraySum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a limit for an array:- ");
		int num=scan.nextInt();
		int a[]=new int[num];
		int i,sum=0;
		System.out.println("Enter "+num+" element:-");
		for(i=0;i<num;i++)
		{
			a[i]=scan.nextInt();
			sum=sum+a[i];
			//System.out.println(sum);
		}
		System.out.println("Sum of "+num+" array elements is:- "+sum);
	}
	public static void main(String args[])
	{
		new SumTest().inputArraySum();
	}
}