package com_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_func {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		// large interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		driver.manage().window().maximize();
		WebElement final1 = driver.findElement(By.xpath("//div[@class ='footer']"));
		// javascript Executor - small interface
		JavascriptExecutor js = (JavascriptExecutor) driver;// Narrowing typecast
		js.executeScript("arguments[0].scrollIntoView();", final1);
		Thread.sleep(2000);
		//scroll up
		WebElement arc = driver.findElement(By.name("Binaries"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", arc);

	}

}
