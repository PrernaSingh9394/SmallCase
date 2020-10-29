package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPage {

	public WebDriver driver;
	
	public String flipkartGetPrice()
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//div[@class='mCRfo9']/div/div/button")).click();
		
		//Enter item in search field and click
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask ");
		
		
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		
		//Item opens in new window
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div")).click();
		

		for (String winHandle : driver.getWindowHandles()) 
		{
		driver.switchTo().window(winHandle); 
		  
		String title2=driver.getTitle();
		
		System.out.println(title2);
		
		
		// switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
		WebElement price1=driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']"));
		
		String product_price1=price1.getText();
		
		System.out.println("Price of the Product in Flipkart is :"+product_price1);
		
		//click on Add to Cart
		driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button[normalize-space()= '+']")));
	
		//Increase the quantity by 1
		driver.findElement(By.xpath("//div//button[normalize-space()= '+']")).click();
		
		//Get and print the new price
		WebElement price2=driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']"));
		
		String product_price2=price2.getText();
		
		System.out.println("New Price of the Product present in Flipkart Cart is :"+product_price2);
		
		return product_price2;
		
		
	}

	public void browserQuit() {
		driver.quit();
	}
}
