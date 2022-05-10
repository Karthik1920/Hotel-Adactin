package com_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Concept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		// All data
		System.out.println("All Data:");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : alldata) {
			String text = all.getText();
			System.out.println(text);
		}

		System.out.println();
		// Row data
		System.out.println("Row data:");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[3]"));
		for (WebElement row : rowdata) {
			String text = row.getText();
			System.out.println(text);
		}

		System.out.println();
		//column data
		System.out.println("Column Data:");
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement column : columndata) {
			String text = column.getText();
			System.out.println(text);
		}
	System.out.println();
	//particular data
	System.out.println("Particular data");
	WebElement particulardata = driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]"));
	String text = particulardata.getText();
	System.out.println(text);
	
	System.out.println();
	//Headers
	System.out.println("Headers in All:");
	List<WebElement> headers = driver.findElements(By.tagName("th"));
	for (WebElement head : headers) {
		String text2 = head.getText();
		System.out.println(text2);
		
	}
	
	}
	}
