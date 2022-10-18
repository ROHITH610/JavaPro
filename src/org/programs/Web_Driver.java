package org.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.com/in/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://neuralink.com/");
		
		driver.navigate().refresh();
		
		driver.close();
		

		
	}

}
