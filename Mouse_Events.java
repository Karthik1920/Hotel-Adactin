package com_basics;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		// click
		WebElement sclick = driver.findElement(By.xpath("(//button[@type ='button'])[4]"));
		Actions ac = new Actions(driver);
		ac.click(sclick).build().perform();
		// Right click
		WebElement rclick = driver.findElement(By.xpath("(//button[@type ='button'])[3]"));
		ac.contextClick(rclick).build().perform();
		// double click
		WebElement dclick = driver.findElement(By.xpath("(//button[@type ='button'])[2]"));
		ac.doubleClick(dclick).build().perform();
		driver.navigate().to("https://www.amazon.com/");
		// move to Element
		WebElement move1 = driver.findElement(By.xpath("//img[@alt ='ESV Economy Bible']"));
		ac.moveToElement(move1).build().perform();
		ac.click(move1).build().perform();
		// drag and drop
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();

	}
}
