package assignments;

import java.util.ArrayList;

public class A101_C28_CollectionMethods 
{
public static void main(String[] args) 
{
	ArrayList A1=new ArrayList();
	A1.add("anusha");
	A1.add(10);
	A1.add("Rohith");
	A1.add(17);
	A1.add("Ram");
	A1.add(13);
	A1.add("dyno");
	A1.add(6);
	A1.add("ch");
	System.out.println("A1 with all Add values > " + A1);

	A1.remove("ch");
	System.out.println("A1 with all Add values after remove > " + A1);

	
	System.out.println("-----------------------------------------------------------> ");
	ArrayList A2=new ArrayList();
	A2.add("Anu");
	A2.add(12);
	System.out.println("A2 with all Add values > " + A2);
	A2.addAll(A1);
	System.out.println("A2 after addall of A1 values > " + A2);
	System.out.println("-----------------------------------------------------------> ");
	
	System.out.println("Contains and ContainsAll");
	
	System.out.println("Contains ouput is > "+ A2.contains("dyno"));
	System.out.println("ContainsAll output is > "+A2.containsAll(A1));
	System.out.println("-----------------------------------------------------------> ");
	System.out.println("Remove and remove all");
	
	A1.remove("ch");
	System.out.println("A1 with all Add values after remove > " + A1);
	A2.removeAll(A1);
	System.out.println("A2 with RemoveAll value > "+ A2);
	
	System.out.println("-----------------------------------------------------------> ");
	System.out.println("Size And Clear");
	System.out.println("Printing the size of A1 value " + A1.size());
	System.out.println("Printing the size of A2 value " + A2.size());
	
	A1.clear();
	System.out.println("Printing the A1 value after clear " + A1);
	
	System.out.println("-----------------------------------------------------------> ");
	System.out.println("IsEmpty");
	
	ArrayList A3=new ArrayList();
	System.out.println("Output of IsEmpty is > " + A3.isEmpty());




}
}
