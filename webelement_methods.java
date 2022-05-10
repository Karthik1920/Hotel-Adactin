package com_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// sendkeys
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("karthicksuriya01@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		// click
		//WebElement login = driver.findElement(By.name("login"));
		//login.click();
		// Get Attribute using name
		String attribute = emailid.getAttribute("name");
		System.out.println(attribute);
		// Get Attribute using value
		String attribute1 = emailid.getAttribute("value");
		System.out.println(attribute1);
		// emailid.clear();
		// pass.clear();

	}

}
