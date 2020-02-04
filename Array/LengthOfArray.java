class LengthOfArray
{
	void lengthFunction(String ... a)
	{
		int count=0;
		for(String s:a)
		{
			int i=s.length();
			System.out.println("Length of s["+count+"]:-"+i);
			count++;
		}
	}
	public static void main(String args[])
	{
		new LengthOfArray().lengthFunction("Hello","All","Good","Morning");
	}
}