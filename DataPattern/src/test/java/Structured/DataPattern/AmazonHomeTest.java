package Structured.DataPattern;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.amazonhomeobject;
import resources.base;
import resources.base2;

public class AmazonHomeTest extends base2{
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void Launch() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	@Test
	public void AmazonHomePage()
	{
		String searchstring="Home decor";
		amazonhomeobject amo=new amazonhomeobject(driver);
		amo.getsearchbox().sendKeys(searchstring);
		amo.getsearchboxbtn().click();
		log.info("searching...");
		System.out.println(amo.getsearchresultpage().getText());
		Assert.assertEquals(amo.getsearchresultpage().getText(), "\"Home decor\"");//purposely failing test to take screenshot on failure
	}
	@AfterTest
	public void teardown()
	{
			driver.close();
	}
	
}

