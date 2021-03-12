package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

		public WebDriver driver;
		
		By signin=By.cssSelector("a[href*='sign_in']");
		By title=By.xpath("//h2['Featured Courses']");
		By NavigationBar=By.xpath("//div[@role='navigation']");
		
		public Landingpage(WebDriver driver)
		{
			this.driver=driver;
		}
		public WebElement getLogin()
		{
			return driver.findElement(signin);
		}
		public WebElement getTitle()
		{
			return driver.findElement(title);
		}
		public WebElement getNavigation()
		{
			return driver.findElement(NavigationBar);
		}
	}


