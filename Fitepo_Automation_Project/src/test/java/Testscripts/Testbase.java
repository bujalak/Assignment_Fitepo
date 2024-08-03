package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.annotations.VisibleForTesting;

import Com.qa.pages.Fitepo_pages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

   
	public WebDriver driver;
	Fitepo_pages fitepo;
	
	@BeforeClass
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://fitpeo.com/home");
		fitepo = new Fitepo_pages(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@AfterClass
	
	public void teardown() {
		driver.quit();
	}
	

}
