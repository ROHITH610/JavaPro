package org.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown_Method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiple);
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		
		System.out.println("** All Options **");
		List<WebElement> All = s.getOptions();
		for (WebElement alloptions : All) {
			String text = alloptions.getText();
			System.out.println(text);
			
			
			
		}
		
		}
		
			
		}
		
		


