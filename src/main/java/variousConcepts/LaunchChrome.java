package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	static WebDriver driver;
	

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negTest();
		tearDown();
	

	}
    public static void launchBrowser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-seleniumclass\\Class1\\drivers\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	
    	driver.manage().deleteAllCookies();
    	
    	driver.get("https://techfios.com/billing/?ng=login/");
    	driver.manage().window().maximize();
    	
    }
    public static void loginTest() {
       driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
    	
    }
    
    public static void negTest() {
    	driver.findElement(By.id("username")).sendKeys("demo@techfios.com1");
    	driver.findElement(By.id("password")).sendKeys("abc1234");
    	driver.findElement(By.name("login")).click();
    }
    public static void tearDown() {
    	driver.close();
    	
    }
}
