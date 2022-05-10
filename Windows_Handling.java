package com_basics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.manage().window().maximize();
		WebElement mobiles = driver.findElement(By.xpath(("//a[text() =\"Mobiles\"]")));

		Actions ac = new Actions(driver);
		ac.contextClick(mobiles).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement elect = driver.findElement(By.xpath("//a[text() =' Electronics ']"));
		ac.contextClick(elect).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// get window handle-used to handle multiple windows
		Set<String> windowHandles = driver.getWindowHandles();
		for (String all : windowHandles) {
			String title = driver.switchTo().window(all).getTitle();
			System.out.println(title);
		}
		String mytitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(mytitle)) {
				break;

			}

		}
	}
}
