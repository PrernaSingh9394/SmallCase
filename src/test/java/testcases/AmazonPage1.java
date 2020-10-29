package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonPage1 extends BasePage
{
	private WebElement searchField1 = getDriver().findElement(By.id("twotabsearchtextbox"));

	private WebElement searchButton1 = getDriver().findElement(By.xpath("//input[@type='submit' and @value='Go']"));
	
	//private WebElement clickProduct1 = getDriver().findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[6]"));
	
	public WebElement getSearchField1()
	{
		return searchField1;
	}
	
	public WebElement getSearchButton1()
	{
		return searchButton1;
	}
	
	/*public WebElement getproduct1()
	{
		return clickProduct1;
	}

	public void windowshandle()
	{
		String parentHandle = driver.getWindowHandle();
		
		getproduct1().click();
		//driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[6]")).click();
		
		for (String winHandle1 : driver.getWindowHandles()) 
		{
		driver.switchTo().window(winHandle1); 
		  
		String title3=driver.getTitle();
		
		System.out.println(title3);
		}
	}*/
}
