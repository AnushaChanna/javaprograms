package java_Programs;

import java.util.Stack;

public class A115_C33_StackMethods_PopPeakPush
{
	public static void main(String[] args)
	{
		Stack s=new Stack<String>();
		s.add("Anusha");
		s.add(10);
		s.add("Channa");
		s.add(9);
		s.add("female");
		System.out.println("stack values >> " +s);
		
		s.pop();
		System.out.println("pop values >> "+s);

		s.peek();
		System.out.println("peek values >> "+s);
		
		s.push("Hello");
		System.out.println("push values >> "+s);
}
}