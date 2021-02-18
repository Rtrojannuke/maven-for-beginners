package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
	
	@Test
	public void log() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath+"/src/main/resources/libs/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mvnrepository.com/");
	}

}
