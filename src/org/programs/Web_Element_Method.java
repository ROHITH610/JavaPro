package org.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element_Method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement emaild = driver.findElement(By.id("email"));
		emaild.sendKeys("sonu1911@gmail.com");
		
		boolean displayed = emaild.isDisplayed();
		System.out.println(displayed);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("christy123");
		
		boolean enabled = password.isEnabled();
		System.out.println(enabled);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.close();
	}

}
