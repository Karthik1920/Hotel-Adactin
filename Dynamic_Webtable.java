package com_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.handler.ContextHandler.StaticContext;

public class Dynamic_Webtable {
	static int indexofTotal, indexofRecovered, indexofActive;
	 static String country="Greece";
	 
	public static void main(String[] args) {
   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		//Iterate all headers
		List<WebElement> allheaders = driver.findElements(By.tagName("th"));
		for (int i = 0; i < allheaders.size() ; i++) {
			String text = allheaders.get(i).getText();
			//System.out.println(text);
			String headers = text.replaceAll("\n", " ");
			System.out.println(headers);
			
			if (headers.equalsIgnoreCase("Total cases")) {
				indexofTotal=i;
				System.out.println("index of total:" +indexofTotal);
			}
				else if (headers.equalsIgnoreCase("Total Recovered")) {
					indexofRecovered=i;
					System.out.println("index of Recovered:"+indexofRecovered);
			
				}	
			
			else if (headers.equalsIgnoreCase("Active cases")) {
				indexofActive=i;
				System.out.println("index of Active:"+indexofActive);
				
			}
		}
			//traverse into body
			List<WebElement> allrows = driver.findElements(By.xpath("//table/tbody[1]/tr"));
			for (int i = 0; i < allrows.size(); i++) {
				List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
				for (int j = 0; j < alldata.size(); j++) {
					if (alldata.get(j).getText().equalsIgnoreCase(country)) {
						System.out.println("Total cases:"+alldata.get(indexofTotal).getText()) ;
						System.err.println("Recovered cases:"+alldata.get(indexofRecovered).getText());
						System.out.println("Active cases:"+alldata.get(indexofTotal).getText());
					}
					
				}
				
driver.close();				
			
			}
		}
}
