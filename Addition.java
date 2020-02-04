class Addition 
{
	static void addition(int a1,int a2)
	{
		System.out.println("addition of 2 no:-"+(a1+a2));
	}
	public static void main(String args[])
	{
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		addition(i,j);
	}
}