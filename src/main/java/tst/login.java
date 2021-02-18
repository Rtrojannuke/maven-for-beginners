package tst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	public WebDriver driver;
	
	@BeforeTest
	public void brun() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath+"/src/main/resources/libs/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get("https://github.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}	
	
	@Test
	public void log() {		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.id("login_field")).sendKeys("      ");
		driver.findElement(By.id("password")).sendKeys("  ");
		driver.findElement(By.id("login")).click();
	}
	@Test
	public void logn() {		
		driver.findElement(By.id("login_field")).sendKeys("amy@drf.com");
		driver.findElement(By.id("password")).sendKeys("passwords");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterTest
	public void arun() {
		
		driver.quit();
	}

}
