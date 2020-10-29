package testcases;

import org.openqa.selenium.WebDriver;

public class TestPage {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		
		FlipkartHomePage homePage=new FlipkartHomePage();
		homePage.initialize();
		homePage.navigate();
		
		FlipkartPage1 page1=new FlipkartPage1();
		page1.getSearchField().sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask ");
		
		page1.getSearchButton().click();
		
		//driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div")).click();
		 
		page1.getItem().click();
		
		for (String winHandle : driver.getWindowHandles()) 
		{
		driver.switchTo().window(winHandle); 
		  
		String title2=driver.getTitle();
		
		System.out.println(title2);
		
		}

		
		/*
		AmazonHomePage homepage1=new AmazonHomePage();
		homepage1.initialize();
		homepage1.navigateAmazon();
		
		AmazonPage1 page2=new AmazonPage1();
		page2.getSearchField1().sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask");
		
		page2.getSearchButton1().click();
		
		/*page2.getItem1().click();
		
		for (String winHandle1 : driver.getWindowHandles()) 
		{
		driver.switchTo().window(winHandle1); 
		  
		String title3=driver.getTitle();
		
		System.out.println(title3);
		
		}*/
		
		
		
		
		
		
	}

}
