import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		double a,b,c;
		int d;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a=sc.nextDouble();
		
		System.out.print("Enter B : ");
		b=sc.nextDouble();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter Your Choice : ");
		d=sc.nextInt();
		
		switch(d)
		{
			case 1:
				c=a+b;
				System.out.println("Addition : "+c);
				break;
			case 2:
				c=a-b;
				System.out.println("Subtraction : "+c);
				break;
			case 3:
				c=a*b;
				System.out.println("Multiplication : "+c);
				break;
			case 4:
				c=a/b;
				System.out.println("Division : "+c);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
				
		}
	}
}
