package com_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		// Single Frame
		driver.switchTo().frame("singleframe");
		WebElement click = driver.findElement(By.xpath("//input[@type ='text']"));
		click.sendKeys("java");
		// default content = frame to webpage
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// Multiple Frame
		WebElement click1 = driver.findElement(By.xpath("(//a[@class = 'analystic'])[2]"));
		click1.click();
		// outer frame
		WebElement click2 = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		driver.switchTo().frame(click2);
		// inner frame
		WebElement click3 = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		driver.switchTo().frame(click3);
		WebElement click4 = driver.findElement(By.xpath("//input[@type='text']"));
		click4.sendKeys("Selenium");
		// parent frame= from inner frame to outer frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}
