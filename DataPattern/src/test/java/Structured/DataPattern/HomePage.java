package Structured.DataPattern;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.FirstPage;
import resources.base;

public class HomePage extends base {
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void Launch() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialised");
		
	}
	@Test(dataProvider="getData")
	public void baseNavigation(String Username,String Password)throws Exception
	{ 
		
		driver.get(prop.getProperty("url1"));
		FirstPage fp=new FirstPage(driver);
		fp.username().sendKeys(Username);
		fp.password().sendKeys(Password);
		fp.getlogin().click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="prachi";
		data[0][1]="s123";

		data[1][0]="chipra";
		data[1][1]="7123d";
		return data;
	}
	@AfterTest
	public void teardown()
	{
			driver.close();
	}
	
}

