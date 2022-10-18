package org.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Method {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("ROHITH");
		
		driver.switchTo().defaultContent();
		
		WebElement iframeButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframeButton.click();
			WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			
			driver.switchTo().frame(outerframe);
					
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
		text2.sendKeys("SELENIUM");	
		Thread.sleep(2000);
	}

}
