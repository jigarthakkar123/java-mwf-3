import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		/*
		 * country.deselectByVisibleText("INDIA"); Thread.sleep(2000);
		 */
		
		country.selectByValue("ITALY");
		Thread.sleep(2000);
		/*
		 * country.deselectByValue("ITALY"); Thread.sleep(2000);
		 */
		driver.close();
	}
}
