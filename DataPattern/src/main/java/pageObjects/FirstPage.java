package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
	
		WebDriver driver;
		By email=By.id("user_email");
		By pwd=By.id("user_password");
		By login=By.name("commit");
		public FirstPage(WebDriver driver) {
			this.driver=driver;
		}

		public WebElement username()	
		{
			return driver.findElement(email);
		}
		public WebElement password()	
		{
			return driver.findElement(pwd);
		}
		public WebElement getlogin()	
		{
			return driver.findElement(login);
		}
}
 