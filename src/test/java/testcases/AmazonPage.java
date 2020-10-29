package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {

	public WebDriver driver;
	
	public String amazonGetPrice()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask");
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		
        String parentHandle = driver.getWindowHandle(); // get the current window handle
		
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[6]")).click(); 
		
		for (String winHandle : driver.getWindowHandles()) 
		{
		driver.switchTo().window(winHandle); 
		  
		String title2=driver.getTitle();
		
		System.out.println(title2);
		
		
		// switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
		//Getting Price
		WebElement price3=driver.findElement(By.id("priceblock_ourprice"));
		
		String product_price3=price3.getText();
		
		System.out.println("Price of the Product in Amazon is :"+product_price3);
		
		//Click on Add to cart button
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//Go to Cart
		
		driver.findElement(By.id("nav-cart-count")).click();
		
		//Get and print price
		WebElement price4=driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']"));
		
		String product_price4=price4.getText();
		
		System.out.println("Price of the Product present in Amazon Cart is :"+product_price4);
		
		return product_price4;
		
	}
	public void browserQuit1() 
	{
		driver.quit();
	}
}
