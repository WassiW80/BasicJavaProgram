/*2: WAP to create a class Student and calculate the percentage of a student and check its grade also?*/

class Student
{
	int stdRollNo=40;
	String stdName="Wassi";
	double stdFees=52004;
	void grade(int s1,int s2,int s3)	
	{
		int totalMarks=(s1+s2+s3);
		double percentage=(totalMarks*100)/300;
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
	void display()
	{
		System.out.println("Rollno "+stdRollNo+"\nName "+stdName+"\nFees "+stdFees);
	}
}
class StudentMain
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.display();
		s.grade(75,47,58);
	}
}
