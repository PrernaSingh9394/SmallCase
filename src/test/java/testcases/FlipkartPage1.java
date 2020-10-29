package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartPage1 extends BasePage
{
	public WebDriverWait wait;

	private WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));

	private WebElement searchButton = driver.findElement(By.xpath("//button[@class='vh79eN']"));
	
	private WebElement clickItem = driver.findElement(By.xpath("//a[@title='Wildcraft HypaShield Supermask reusable outdoor protection mask 12536']"));
	
	public WebElement getSearchField()
	{
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
		
		return searchField;
	}
	
	public WebElement getSearchButton()
	{
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='vh79eN']")));
		return searchButton;
	}
	
	public WebElement getItem()
	{
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Wildcraft HypaShield Supermask reusable outdoor protection mask 12536']")));
		return clickItem;
	}

	public void windowHandle()
	{

		for (String winHandle : getDriver().getWindowHandles()) 
		{
		getDriver().switchTo().window(winHandle); 
		  
		String title2=getDriver().getTitle();
		
		System.out.println(title2);
		
		}
	}








}
