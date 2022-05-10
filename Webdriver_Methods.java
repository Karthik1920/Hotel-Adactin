package com_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		// browser launching syntax
		// interface class
		WebDriver driver = new ChromeDriver();// upcasting
		// parent child
		// get url launch
		driver.get("https://www.facebook.com/");
		// Maximize window
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");// Navigation methods -to
		driver.navigate().back(); // Navigation methods-back
		String title = driver.getTitle();
		System.out.println("Title:" + title); // get title String title =
		driver.navigate().forward(); // Navigation
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL:" + currentUrl);// get current Url String
		Thread.sleep(3000);
		driver.navigate().refresh();// Navigation methods -refresh
		driver.close();// close

	}

}
