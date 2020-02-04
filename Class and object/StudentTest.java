class Student
{
	double stdId,fees;
	String sname;
	double calculatePercentage(double sub1,double sub2,double sub3)
	{
		double percentage=((sub1+sub2+sub3)*100)/300;
		return percentage;
	}
	void display()
	{	System.out.println("------------STUDENT DETAILS------------");
		System.out.println("Std No:-"+stdId+"\nStd Name:-"+sname+"\nFees:- "+fees);
	}
}
class StudentTest
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.stdId=25;
		s1.sname="Wassi";
		s1.fees=4000;
		s1.display();
		System.out.println(s1.calculatePercentage(56,76,45));
		Student s2=new Student();
		s2.stdId=26;
		s2.sname="Muheb";
		s2.fees=5000;
		s2.display();
		System.out.println(s2.calculatePercentage(78,76,65));
	}
}
