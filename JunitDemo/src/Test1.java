import org.junit.Ignore;
import org.junit.Test;

public class Test1 {

	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(expected = ArithmeticException.class)
	public void test11()
	{
		System.out.println("Exception Will Be There");
		System.out.println(1/0);
	}
}
