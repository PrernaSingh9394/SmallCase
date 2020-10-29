package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	
	@BeforeMethod
	public void initialize()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void closeDriver()
	{
		this.driver.quit();
	}
	
	public WebDriver getDriver()
	{
		return this.driver;
	}

}
