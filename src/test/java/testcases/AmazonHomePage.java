package testcases;

import java.util.concurrent.TimeUnit;

public class AmazonHomePage extends BasePage{
	
	public void navigateAmazon()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
