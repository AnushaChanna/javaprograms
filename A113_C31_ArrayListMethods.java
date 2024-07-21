package java_Programs;

import java.util.ArrayList;

public class A113_C31_ArrayListMethods 
{
public static void main(String[] args)
{

	ArrayList A1=new ArrayList();
	A1.add("anusha");
	A1.add("channa");
	A1.add("rohitha");
	A1.add("charan");
	A1.add("dyno");
	A1.add("doggie");
	System.out.println(A1);
	
	System.out.println("index of charan is > " +A1.indexOf("charan"));
	System.out.println("get the data of index 2 > " +A1.get(2));
	A1.set(5, "pet");
	System.out.println("Set value > "+ A1);


}
}
