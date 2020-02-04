class ArrayTest
{
	static void copyArray()
	{
		int a[],b[];
		a=new int[3];
		b=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		b[0]=a[0];											//copy of array
		b[1]=a[1];
		b[2]=a[2];
		System.out.println("B[0]:-"+b[0]+"\nB[1]:-"+b[1]+"\nB[2]:-"+b[2]);
	}
	static void functionForLoop()
	{
		int b[][];
		b=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{																				//2D Array Loop
				b[i][j]=1000;
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print("B["+i+"]["+j+"]:-"+b[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void functionCount()
	{
		int x[];
		x=new int[4];
		int count=0;
		for(int i=0;i<4;i++)															//Addition of Array
		{
			x[i]=100;
			count=count + x[i];
		}
		System.out.print("______________Count______________\n");
		System.out.print(count);
	}
	static void functionDirect()
	{
		int x[]=new int[]{100,200,300,400};					//Declaration,Construction,Initialization
		int count=0;
		for(int i=0;i<4;i++)
		{
			count=count + x[i];
		}
		System.out.print("\n______________Direct______________\n");
		System.out.println(count);
	}
	static void functionArray()
	{
		int a[],b[];
		a=new int[3];
		a[0]=100;
		a[1]=200;																			//Normal Array 
		a[2]=300;
		System.out.println("A[0]:-"+a[0]+"\nA[1]:-"+a[1]+"\nA[2]:-"+a[2]);
	}
		
			
	public static void main(String args[])
	{
		System.out.println("______________Normal______________");
		functionArray();
		System.out.println("______________Copy______________");
		copyArray();
		System.out.println("______________Loop______________");
		functionForLoop();
		functionCount();
		functionDirect();
	}
}
