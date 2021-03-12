package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	static ExtentReports extent;
	
	public static ExtentReports config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esp= new ExtentSparkReporter(path);
		esp.config().setReportName("Web automation results");
		esp.config().setDocumentTitle("Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(esp);
		extent.setSystemInfo("Tester", "Prachi");
		return extent;
		
	}
	@Test
	public void initialDemo() {
		ExtentTest test=extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		driver.close();
	}
}
