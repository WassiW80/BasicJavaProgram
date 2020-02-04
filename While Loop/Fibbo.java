//Write a program to print fibonacci number

class Fibbo
{
	public static void main(String args[])
	{
		int a1=1,a2=1,n=5,i=1,a3=0;
		System.out.println(a1);
		System.out.println(a2);
		while(i<n)
		{
			a3=a1+a2;
			a1=a2;
			a2=a3;
			System.out.println(a3);
			i++;
		}
	}
}
			