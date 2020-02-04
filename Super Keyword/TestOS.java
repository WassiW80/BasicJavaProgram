class OS
{
	int osVersion;
	int ram,disk;
	double processor;
}
class Windows extends OS
{
	int osVersion;
	Windows()
	{
		this(11,4,250,2.9);
	}
	Windows(int osVersion,int ram,int disk,double processor)
	{
		super .osVersion=osVersion;
		//System.out.println(super.osVersion);
		super.ram=ram;
		super.disk=disk;
		super.processor=processor;
	}
}
class Linux extends Windows
{
	int osVersion=10;
	int ram=8;
	int disk=1000;
	double processor=3.7;
	
	void compare()
	{
		
		
		if(ram>super.ram && disk>super.disk)
		{
			if(disk>super.disk && processor>super.processor)
			{
				if(processor>super.processor && osVersion>super.osVersion)
				{
				System.out.println("Linux is Better");
				}
				else
					System.out.println("Linux is Better");
			}
		}
		else
			System.out.println("Windows is Better");
	}
}	
class TestOS
{
	public static void main(String args[])
	{
		Linux lx=new Linux();
		lx.compare();
	}
}
