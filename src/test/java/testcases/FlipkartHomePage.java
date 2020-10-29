package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHomePage extends BasePage
{
	
	public void navigate()
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Actions actions=new Actions(driver);
		Action action =actions.sendKeys(Keys.ESCAPE).build();
		action.perform();
	}
	
	
}
