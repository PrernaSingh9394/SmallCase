package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends TestPage{

	public WebDriver driver;
	
	@BeforeMethod
	public void initialize()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public void UploadPage()
	  {
	   PageFactory.initElements(driver, this);
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
