package baseFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeTest
	public void browserLaungh() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();

	}

}
