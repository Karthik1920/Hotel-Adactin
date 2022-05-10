package com_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_project {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("karthikey");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("1TX651");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		Select s1 = new Select(location);
		s1.selectByVisibleText("Paris");
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.click();
		Select S2 = new Select(hotels);
		S2.selectByVisibleText("Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		room.click();
		Select S3 = new Select(room);
		S3.selectByVisibleText("Deluxe");
		WebElement Sdate = driver.findElement(By.id("datepick_in"));
		Sdate.clear();
		Sdate.sendKeys("30/04/2022");
		WebElement Edate = driver.findElement(By.id("datepick_out"));
		Edate.clear();
		Edate.sendKeys("30/05/2022");
		WebElement Aroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(Aroom);
		s4.selectByValue("2");
		WebElement Croom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(Croom);
		s5.selectByValue("2");
		WebElement Search = driver.findElement(By.id("Submit"));
		Search.click();
		WebElement ok1 = driver.findElement(By.xpath("//input[@name ='radiobutton_0']"));
		ok1.click();
		WebElement ok2 = driver.findElement(By.id("continue"));
		ok2.click();
		WebElement Fname = driver.findElement(By.id("first_name"));
		Fname.sendKeys("Karthikeya");
		WebElement Lname = driver.findElement(By.id("last_name"));
		Lname.sendKeys("M");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("oracle chennai");
		WebElement creditcard = driver.findElement(By.id("cc_num"));
		creditcard.sendKeys("1234567890123456");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select S6 = new Select(cardtype);
		S6.selectByVisibleText("Other");
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select S7 = new Select(expmonth);
		S7.selectByValue("7");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select S8 = new Select(expyear);
		S8.selectByVisibleText("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		WebElement cancel = driver.findElement(By.id("cancel"));
		cancel.click();
		WebElement cancel2 = driver.findElement(By.id("cancel"));
		cancel2.click();
		WebElement reset = driver.findElement(By.id("Reset"));
		reset.click();
		WebElement logout = driver.findElement(By.xpath("//a[text() ='Logout']"));
		logout.click();

	}

}
