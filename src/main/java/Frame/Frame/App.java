package Frame.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
static WebDriver driver;

    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", ".\\Data_Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.findElement(By.id("philadelphia-field-email")).sendKeys("Test");
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html[1]/body[1]/a[1]/img[1]")).click();
    }
}
