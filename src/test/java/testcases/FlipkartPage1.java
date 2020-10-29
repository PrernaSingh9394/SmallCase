package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlipkartPage1 extends BasePage
{

	private WebElement searchField = getDriver().findElement(By.xpath("//input[@name='q']"));

	private WebElement searchButton = getDriver().findElement(By.xpath("//button[@class='vh79eN']"));
	
	private WebElement clickItem = getDriver().findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div"));
	
	public WebElement getSearchField()
	{
		return searchField;
	}
	
	public WebElement getSearchButton()
	{
		return searchButton;
	}
	
	public WebElement getItem()
	{
		return clickItem;
	}









}
