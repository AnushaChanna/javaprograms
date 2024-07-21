package java_Programs;
import java.util.Scanner;
public class A40_Scanner_InputMismatch 
	{
		static Scanner S1=new Scanner(System.in);
		
		public static void main(String[] args) 
		{
			String a = S1.next(); 			// batch42
			byte b = S1.nextByte(); 		// 5678       		correct -78
			short c = S1.nextShort(); 		// 987654 			correct -789
			int d = S1.nextInt(); 			// anusha			correct -78968
			long e= S1.nextLong(); 			// 12anusha42		correct -987654321
			float f = S1.nextFloat();		//78.99f			correct -99.99 or 98
			double g = S1.nextDouble(); 	//true 				correct -98.765
			boolean h = S1.nextBoolean();	//42				correct -true or false
		}
	}
