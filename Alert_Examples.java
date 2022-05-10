package com_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Examples {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();

		// Simple alert
		WebElement click = driver.findElement(By.xpath("//button[text() = 'Alert Box']"));
		click.click();
		Thread.sleep(2000);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		// confirm alert
		WebElement click1 = driver.findElement(By.xpath("//button[text() = 'Confirm Box']"));
		click1.click();
		Thread.sleep(2000);
		Alert Confirmalert = driver.switchTo().alert();
		Confirmalert.dismiss();
		// Prompt alert
		WebElement click2 = driver.findElement(By.xpath("//button[text() = 'Prompt Box']"));
		click2.click();
		Thread.sleep(2000);
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("karthik");
		String text = promptalert.getText();
		System.out.println(text);
		promptalert.accept();
		driver.close();
	}

}
