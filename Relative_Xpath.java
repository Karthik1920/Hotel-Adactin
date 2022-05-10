package com_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement email1 = driver.findElement(By.xpath("//input[@type ='text']"));
		email1.sendKeys("oneplus mobile");
		WebElement enter1 = driver.findElement(By.xpath("//input[@id ='nav-search-submit-button']"));
		enter1.click();
		driver.close();
	}
}
