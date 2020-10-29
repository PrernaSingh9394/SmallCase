package testcases;

import org.openqa.selenium.WebDriver;

public class TestPage {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		
		FlipkartHomePage homePage=new FlipkartHomePage();
		homePage.initialize();
		homePage.navigate();
		homePage.UploadPage();
		
		
		FlipkartPage1 page1=new FlipkartPage1();
		
		page1.getSearchField().sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask ");
		
		page1.getSearchButton().click();
		
		page1.getItem().click();
		
		//page1.windowHandle();

		
		
		AmazonHomePage homepage1=new AmazonHomePage();
		homepage1.initialize();
		homepage1.navigateAmazon();
		
		AmazonPage1 page2=new AmazonPage1();
		page2.getSearchField1().sendKeys("Wildcraft HypaShield Supermask reusable outdoor protection mask");
		
		page2.getSearchButton1().click();
		
		page2.getproduct1().click();
		
		
		
		
		
		
		
	}

}
