package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
		
driver.findElement(By.xpath("//div[@class='mCRfo9']/div/div/button")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask ");
		
		
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		
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
		
		String product_price=price1.getText();
		
		System.out.println(product_price);
		
		
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()= '+']")).click();
		
		WebElement price2=driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']"));
		
		String product_price2=price2.getText();
		
		System.out.println(product_price2);
		

	}

}
