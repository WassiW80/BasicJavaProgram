/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

class AttendenceDemo
{
	public static void main(String args[])
	{
		int ClassesAttended=94,ClassesHeld=125;
		double Percentage;
		Percentage=(ClassesAttended*100)/ClassesHeld;
		if(Percentage>=75)
		{
			System.out.println("Your Attendence is "+Percentage+"% hence you are allowed to sit in exam");
		}
		else
{
			System.out.println("Your Attendence is "+Percentage+"% hence you are not allowed to sit in exam");
		}
	}
}