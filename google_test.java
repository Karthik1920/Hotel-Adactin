package com_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("whatsapp");
		List<WebElement> sear = driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		for (WebElement s1 : sear) {
			System.out.println(s1.getText());
			if (s1.getText().trim().equals("whatsapp")) {
				s1.click();
				break;

			}

		}

		WebElement cli = driver.findElement(By.name("btnK"));
		cli.click();

		WebElement what = driver.findElement(By.xpath("//h3[text() ='WhatsApp']"));
		what.click();

	}
}
