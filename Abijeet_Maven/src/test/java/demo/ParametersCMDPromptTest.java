package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParametersCMDPromptTest {
@Test
	public void cmdPromtRecieveData()
	{
		String URL = System.getProperty("url");
		String EMAIL = System.getProperty("email");
		String PASSWORD = System.getProperty("password");
		
		Reporter.log(URL,true);
		Reporter.log(EMAIL,true);
		Reporter.log(PASSWORD,true);
		
		WebDriver driver = new  ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
}
