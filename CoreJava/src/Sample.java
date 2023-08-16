import java.util.Scanner;

/*
 * Primitive Data Type:
 * 
 * 1. byte - 1byte Byte
 * 2. short - 2byte Short
 * 3. int - 4byte Integer
 * 4. long - 8byte Long
 * 5. float - 4 byte Float
 * 6. double - 8byte Double
 * 7. char - 1byte Character
 * 8. boolean - true/false Boolean
 * 
 * */

public class Sample {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
	}
}
