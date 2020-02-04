/*2: WAP to create a class Student and calculate the percentage of a student and check its grade also?*/

class Student
{
	void grade()	
	{
		double percentage =55;
		if(percentage>=75)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=60)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=50)
		{
			System.out.println("Grade C");
		}
		else if(percentage>=40)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade E");
		}
	}
}
class StudentMain
{
	public static void main(String args[])
	{
		Student s=new Student();
		System.out.println(s.grade());
	}
}