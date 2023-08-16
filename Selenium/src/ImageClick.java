import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tops-int.com/mobile-testing-training-course");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("heading-logo")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
