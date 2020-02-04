/*WAP to create a business class Employee and declare its common properties and calculate the gross salary of emplyee? 
Where ta would be the 5% of salary and hra would be the 20% of salary.*/
class Employee
{
	int empId;
	String eName;
	int salary;
	void setData(int id,String name,int sal)
	{
		empId=id;
		eName=name;
		salary=sal;
	}
	double calculateSalary()
	{
		double ta=(5*salary)/100;			
		double hra=(20*salary)/100;		
		double gross=salary+ta+hra;
		return gross;
	}
	void display()
	{
		System.out.println("______________EMPLOYEES DETAILS______________");
		System.out.println("Employee Id:- "+empId+"\nEmployee Name:- "+eName+"\nSalary:- "+salary);
	}
}
class EmployeeTest
{
	public static void main(String arg[])
	{
		Employee e1=new Employee();
		e1.setData(113,"Wassi",40000);
		e1.display();
		System.out.println(e1.calculateSalary());
		
		
		Employee e2=new Employee();
		e2.setData(114,"Muheb",50000);
		e2.display();
		System.out.println(e2.calculateSalary());
	}
}