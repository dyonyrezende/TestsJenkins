package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.HomePage;

public class Initializer {

	public WebDriver test;
	public HomePage homepage;
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./src/reports/reports.html");
	ExtentReports extent = new ExtentReports();
	
	@Before
	public void initializing() {
		
		test = new ChromeDriver();
		test.get("https://www.magazineluiza.com.br/");
		test.manage().window().maximize();
		homepage = new HomePage(test);
		extent.attachReporter(htmlReporter);
			
	}
	
	
	@After
	public void finish() {
		
		test.quit();
		extent.flush();
		
	}
	
	
}
