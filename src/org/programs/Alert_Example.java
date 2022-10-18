package org.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement simple = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		simple.click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		WebElement confirm = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
		confirm.click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement promptalert = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		promptalert.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Rohith Raj");
		alert.accept();
	
		
	}


}
