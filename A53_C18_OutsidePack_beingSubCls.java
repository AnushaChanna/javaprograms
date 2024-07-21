package java_Programs;

import assignments_Testing.A54_A55_C18_AccesingMethods_InsideOtherPackage;

public class A53_C18_OutsidePack_beingSubCls extends A54_A55_C18_AccesingMethods_InsideOtherPackage
{
	public static void main(String[] args) 
	{
		add();
		A53_C18_OutsidePack_beingSubCls C1=new A53_C18_OutsidePack_beingSubCls();
		C1.mul();	
	}
}
