import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Event {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement flights=driver.findElement(By.linkText("Flights"));
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		Actions builder=new Actions(driver);
		Action moveToHome=builder.moveToElement(home).build();
		moveToHome.perform();
		Thread.sleep(3000);
		Action moveToFlights=builder.moveToElement(flights).build();
		moveToFlights.perform();
		Thread.sleep(3000);
		Action moveToVacations=builder.moveToElement(vacations).build();
		moveToVacations.perform();
		Thread.sleep(3000);
		driver.close();
	}
}
