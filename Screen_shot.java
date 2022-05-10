package com_basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		// large interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// takesScreenshot - small interface
		TakesScreenshot ts = (TakesScreenshot) driver;// narrowing Type casting
		// getscreenshotAs - used to take the screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		// location
		File des = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\screenshot//k.png");
		// copy the file to particular locaton
		FileUtils.copyFile(src, des);
		

	}
}
