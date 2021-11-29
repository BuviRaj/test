package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions ch=new ChromeOptions();
		
		ch.addArguments("incognito");
		
		WebDriver driver= new ChromeDriver(ch);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("buviraj31@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshatra@0703");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	    File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(("C:\\Users\\munna\\eclipse-workspace\\Selenium\\Screenshots\\pic.png"));
		
		FileUtils.copyFile(source,destination);
	}
		

}
		
		