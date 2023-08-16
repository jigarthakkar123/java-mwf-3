import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTesting {
	static ChromeDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Before
	public void before() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("anil2317");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		Thread.sleep(3000);
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.linkText("Bill Pay")).click();
		Thread.sleep(3000);
	}
	@After
	public void after() throws InterruptedException
	{
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);
	}
	@AfterClass
	public static void afterClass()
	{
		driver.close();
	}
}
