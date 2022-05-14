package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest_JUNIT {
	WebDriver driver;
	

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sange\\eclipse-seleniumclass\\Class1\\drivers\\chromeDriver.exe");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		

	}

	@Test
	public void loginTest() throws InterruptedException {
		//identification of element and operation
	//	Thread.sleep(3000);
	//	WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
		
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")).click();
		driver.findElement(By.linkText("New Account"));
		
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("checking bank");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("This is my salary account");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("$ 3000");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("234455");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("Sangeeta");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("214-721-0032");
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")).click();
		
	}

	
  


	@After
	public void tearDown() {
		driver.close();

	}

}
