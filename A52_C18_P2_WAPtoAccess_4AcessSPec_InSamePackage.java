package java_Programs;

public class A52_C18_P2_WAPtoAccess_4AcessSPec_InSamePackage 

// now trying access the  access specifier of A51_C18_P1_4AccessSpecifier_InSameProgram
{

	public static void main(String[] args) 
	{
		A51_C18_P1_4AccessSpecifier_InSameProgram A1=new A51_C18_P1_4AccessSpecifier_InSameProgram();
		A51_C18_P1_4AccessSpecifier_InSameProgram.add(); //pulic
	//	A1.sub(); // not accessable as it is a private
		A1.mul(); //protected
		A1.div(); //package

	}
}
