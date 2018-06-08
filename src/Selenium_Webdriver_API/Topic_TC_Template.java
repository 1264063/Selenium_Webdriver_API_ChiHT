package Selenium_Webdriver_API;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Topic_TC_Template {
	//Khai bao 1 Webdriver
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  //Firefox Driver, If Firefox version <= 47 + Selenium version 2.x.x
//	  driver = new FirefoxDriver();
//	//Firefox Driver, If Firefox version > 47 + Selenium version 3.x.x
//	  System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
//	  driver = new FirefoxDriver();
	  //Chrome Driver
	  System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	//IE
//	  System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
//	  driver = new InternetExplorerDriver();
	  //Wait the page for loading success
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //Minimize browser to full screen
	  driver.manage().window().maximize();
	  //Get URL 
	  driver.get("https://academy-dashboard.mingle.com/dashboard_accounts/sign_in/");
  }
@Test 
  public void c_CheckTitle(){
	  String homepageTitle = driver.getTitle();
	  Assert.assertEquals("Academy Dashboard", homepageTitle);
	 }
@Test 
  public void a_CheckURL(){
	  String homepageURL = driver.getCurrentUrl();
	  Assert.assertEquals("https://academy-dashboard.mingle.com/dashboard_accounts/sign_in/", homepageURL);
	  //AssertJUnit.assertEquals("This is a required field.", driver.findElement(By.xpath(".//*[@id='advice-required-entry-email']")).getText());
  }

  @AfterClass
  public void afterClass() {
	  //Quit Browser 
	  driver.quit();
  }

}
