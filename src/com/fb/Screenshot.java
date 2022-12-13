package com.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
		public void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\s.vimalraj\\eclipse-workspace\\Fb_Selenium\\Driver\\chromedriver_106.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot s = (TakesScreenshot)driver; // narrowing typecasting
	    File a = s.getScreenshotAs(OutputType.FILE);
	    File b = new File("C:\\Users\\s.vimalraj\\eclipse-workspace\\Fb_Selenium\\Screenshot\\facebook.png");
//     	FileHandler.copy(a, b);
		FileUtils.copyFile(a, b);
}
	
}
