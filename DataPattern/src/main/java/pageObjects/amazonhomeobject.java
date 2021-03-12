package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonhomeobject {
	WebDriver driver;
	By searchbox=By.id("twotabsearchtextbox");
	By searchboxbtn=By.id("nav-search-submit-button");
	By searchresultpage=By.xpath("//span[@class='a-color-state a-text-bold']");
	By login=By.name("commit");
	public amazonhomeobject(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getsearchbox()	
	{
		return driver.findElement(searchbox);

	}
	public WebElement getsearchboxbtn()	
	{
		return driver.findElement(searchboxbtn);

	}
	public WebElement getsearchresultpage()	
	{
		return driver.findElement(searchresultpage);

	}
}
