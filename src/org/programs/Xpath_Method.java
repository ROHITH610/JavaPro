package org.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@type='text']"));
		emailId.sendKeys("rohith610@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password'"));
		password.sendKeys("thegladiator");
	}

}
