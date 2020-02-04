class Employee
{
	int empId;
	String name;
	double salary;
	Employee()
	{
		this(12501,"Wassi",30000);
	}		
	Employee(int empId,String name,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("\nEmployee Id:-"+empId+"\nName:- "+name+"\nSalary:-"+salary);
	}
}
class Manager extends Employee
{
	void grossSalary(double ta,double hra)
	{
		ta=(5*salary)/100;			
		hra=(20*salary)/100;		
		double gross=salary+ta+hra;
		salary=gross;
	}
}
class Developers extends Manager
{
	void grossSalaryDevelopers(double ta,double hra)
	{
		ta=(5*salary)/100;			
		hra=(20*salary)/100;		
		double gross=salary+ta+hra;
		salary=gross;
	}
}
class EmployeeTest
{
	public static void main(String args[])
	{
		Developers dp=new Developers();
		dp.grossSalary(5,10);
		dp.display();
		dp.grossSalaryDevelopers(6,12);
		dp.display();
	}
}