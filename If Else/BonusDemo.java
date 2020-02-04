/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/

class BonusDemo
{
	public static void main(String args[])
	{
		double salary,year, net_bonus;
		salary=25000;
		year=5;
		if(year>5)
		{
			net_bonus=(salary*year)*0.5;
			System.out.println(net_bonus);
		}
		else
		{
			System.out.println("N o Bonus");
		}
	}
}