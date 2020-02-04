/*Enter age of user and then using following rules print their place of service.
1. If employees age is in between 20 to 40 then he may work in anywhere
2. If employees age is in between 40 t0 60 then he will work in urban areas only.
3. And any other input of age should print "ERROR".*/

class Service
{
	public static void main(String args[])
	{
		int age;
		age=24;
		if(age>20 && age<40)
		{
			System.out.println("Employee may work in anywhere");
		}
		else if(age>40 && age<60)
		{
			System.out.println("Employee will work in urban areas only");
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}	