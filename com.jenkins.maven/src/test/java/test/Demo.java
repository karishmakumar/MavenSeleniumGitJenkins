package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public static void DemoClass() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\JenkinsTest\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();  
		 driver.get("https://www.google.com");
		 String url = driver.getTitle();
		 System.out.println(url);
		 Assert.assertTrue(driver.getTitle().contains("Google"));
		 System.out.println("welcome to learning");
		 driver.quit();
		 
	}

}
