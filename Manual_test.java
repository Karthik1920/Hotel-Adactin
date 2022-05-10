package com_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manual_test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement sear = driver.findElement(By.id("twotabsearchtextbox"));
		sear.sendKeys("oneplus");
		WebElement sear1 = driver.findElement(By.xpath("//input[@type ='submit']"));
		sear1.click();
		WebElement oneplus = driver.findElement(By.xpath("//img[@class='s-image']"));
		oneplus.click();
		WebElement addcar = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
		addcar.click();
	}

}
