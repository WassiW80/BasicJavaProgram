class ArrayDiagonal
{
	static void matrix()
	{
		int[] a[]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Matrix");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void diagonal()
	{
		int[] a[]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Diagonal");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==j)
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void antiDiagonal()
	{
		int[] a[]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int j=4;
		System.out.println("Anti Diagonal");
		for(int i=0;i<4;i++)
		{
			j--;
			System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
		
	public static void main(String args[])
	{
		matrix();
		diagonal();
		antiDiagonal();
	}
}