class ArgumentAndEnhancedFor
{
	void displayElements(String ... ar)
	{
		String sum ="";
		for(String a:ar)
			sum=sum+a;
			System.out.printf(sum);
	}
	public static void main(String args[])
	{
		//String s[]=new String[]{"args.length"};
		new ArgumentAndEnhancedFor().displayElements("Hi","Good","Morning");
	}
}