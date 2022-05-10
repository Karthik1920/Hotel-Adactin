package com_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create1 = driver.findElement(By.xpath("(//a[@role ='button'])[2]"));
		create1.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("karthik");
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("M");
		WebElement mobile = driver.findElement(By.xpath("(//input[@type ='text'])[4]"));
		mobile.sendKeys("9597531676");
		WebElement password = driver.findElement(By.xpath("(//input[@type ='password'])[2]"));
		password.sendKeys("Karthik");
		WebElement day = driver.findElement(By.id("day"));
		Select s= new Select(day);
		s.selectByValue("19");
		WebElement month = driver.findElement(By.id("month"));
		Select s1= new Select(month);
		s1.selectByValue("7");
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2018");
		Thread.sleep(2000);
		driver.close();
	}

}
