class Phone
{
	int getContact(int a)
	{
		return a;
	}
	String getContact(String name)
	{
		return name;
	}
}
class PhoneTest
{
	public static void main(String args[])
	{
		Phone phone=new Phone();
		System.out.println(phone.getContact(100));
		System.out.println(phone.getContact("Wassi"));
	}
}

		