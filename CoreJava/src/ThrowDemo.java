import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {

	public static void demo() throws ArithmeticException,NullPointerException,InputMismatchException
	{
		int x;
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter X : ");
			x=sc.nextInt();
			if(x>0)
			{
				System.out.println("Square Of "+x+" Is "+(x*x));
			}
			else
			{
				throw new ArithmeticException();
			}
		
	}
	public static void main(String[] args) {
		try{
			demo();
		}catch(Exception e) {
			System.out.println("Exception Caught");
		}finally {
			System.out.println("Finally Block Called");
		}
	}
}
