package com.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Fb_selenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\s.vimalraj\\eclipse-workspace\\Fb_Selenium\\Driver\\chromedriver105.exe");
	WebDriver fb = new ChromeDriver();
	fb.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-JKe1fm2-QIV1jUrCh0CGgMaEAAYASAAEgJF4_D_BwE");
	fb.manage().window().maximize();
	
	
	Thread.sleep(3000);
    TakesScreenshot screen = (TakesScreenshot)fb;
    File a = screen.getScreenshotAs(OutputType.FILE);
    File b = new File("C:\\Users\\s.vimalraj\\eclipse-workspace\\Fb_Selenium\\Screenshot\\facebook.png");
	FileHandler.copy(a, b);
//	FileUtils.copyFile(a, b);
	
	Thread.sleep(3000);
	WebElement name = fb.findElement(By.xpath("//input[@name='firstname']"));
	name.sendKeys("Secretx");
	
	Thread.sleep(3000);
	WebElement sur = fb.findElement(By.xpath("(//input[@name='lastname'])[1]"));
	sur.sendKeys("X");
	
	Thread.sleep(3000);
	WebElement phone = fb.findElement(By.xpath("(//input[@data-type='text'])[3]"));
	phone.sendKeys("6369393224");
	
//	WebElement password = fb.findElement(By.xpath("//input[contains(@data-type,'password')]"));
//	password.sendKeys("secretagent");
	
	Thread.sleep(3000);
	WebElement password = fb.findElement(By.xpath("//input[@name='reg_passwd__']"));
	password.sendKeys("secretagent");
	
	Thread.sleep(3000);
	WebElement day = fb.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s = new Select(day);
    s.selectByIndex(8);
//	s.selectByValue("9");
//	s.selectByVisibleText("9");
	
	Thread.sleep(3000);
	WebElement month = fb.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1 = new Select(month);
//	s1.selectByIndex(8);
//	s1.selectByValue("9");
	s1.selectByVisibleText("Sep");
//	s1.deselectByVisibleText("Sep");
	
	Thread.sleep(3000);
	WebElement year = fb.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("1994");
//	
//	WebElement fe = fb.findElement(By.xpath("(//input[@type='radio'])[1]"));
//	fe.click();
//	
	Thread.sleep(3000);
	WebElement ma = fb.findElement(By.xpath("(//input[@type='radio'])[2]"));
	ma.click();

//	WebElement cu = fb.findElement(By.xpath("(//input[@type='radio'])[3]"));
//	cu.click();
	
	
	WebElement ck = fb.findElement(By.xpath("//button[@type='submit']"));
    ck.click();
    
    System.out.println("Done");
	
	
	}
	
}