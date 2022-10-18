package org.programs;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		

		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("rohith610");
	    
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("rohith123@RR");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s=new Select(location);
		s.selectByValue("Adelaide");
		
		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Creek");
		
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(room);
		s2.selectByValue("Deluxe");
		
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(roomnos);
		s3.selectByValue("1");
		
		WebElement checkindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.click();
		checkindate.sendKeys("22/11/2022");
		
		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.click();
		checkoutdate.sendKeys("23/11/2022");
		
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adultroom);
		s4.selectByValue("2");
		
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(childroom);
		s5.selectByValue("4");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radiobutton.click();
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("rohith");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("raj");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("kannur,kerala");
		
		WebElement creditcardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditcardno.sendKeys("5699874562189612");
		
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(cctype);
		s6.selectByValue("VISA");
		
		WebElement expmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(expmonth);
		s7.selectByValue("12");
		
		WebElement expyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(expyear);
		s8.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("546");
		
		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'][1])"));
		booknow.click();
		
		Thread.sleep(8000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\rohith.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
	}

}
