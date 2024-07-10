package assignments;

import assignments_Testing.A58_C19_Constructor_4AccessSpecifiers;

public class A58_C19_Constructor_OutPackage_Withoutbeing_Subclass 
{
	public static void main(String[] args) 
	{
		new A58_C19_Constructor_4AccessSpecifiers();
	//	new A58_C19_Constructor_4AccessSpecifiers(10);				- private -not accessable
	//	new A58_C19_Constructor_4AccessSpecifiers(10 , 10);			- protected -not accessable
	//	new A58_C19_Constructor_4AccessSpecifiers("Anusha");		- default -not accessable
	}
}
