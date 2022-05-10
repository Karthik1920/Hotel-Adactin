package com_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=57794344246&hvpone=&hvptwo=&hvadid=486386895969&hvpos=&hvnetw=g&hvrand=3787347463516528408&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007812&hvtargid=kwd-362216169274&hydadcr=5620_2175696&gclid=CjwKCAjw8sCRBhA6EiwA6_IF4SiSdrPgw4L5A7kcDrmP48vDPYrypUnIi_3m7uE9qi4MzeXHvMSdmBoCx4EQAvD_BwE");
		
}
}
