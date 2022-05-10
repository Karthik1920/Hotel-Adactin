package com_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));

        //is multiple

		Select s = new Select(multiple);
		boolean mul = s.isMultiple();
		System.out.println("multiple:" + mul);
		s.selectByValue("2");
		s.selectByIndex(3);
		s.selectByVisibleText("Loadrunner");
		s.deselectByVisibleText("Loadrunner");

		// get options

		System.out.println("Get options:");
		List<WebElement> alloptions = s.getOptions();
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
		}

		// Get all selected options
		System.out.println("Get All Selected:");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselected : allSelectedOptions) {
			String text = allselected.getText();
			System.out.println(text);
		}
		// Get first selected options
		System.out.println("Get first Selected:");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

		// Deselect All
		s.deselectAll();
		Thread.sleep(2000);
		driver.close();

	}

}
