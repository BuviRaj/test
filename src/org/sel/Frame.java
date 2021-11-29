package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		WebElement singleframe = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		singleframe.sendKeys("Single Frame");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		WebElement multiframe = driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]"));
		
		multiframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outerframe);
		
		Thread.sleep(3000);
		
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Multiple Frames");
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Video']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}
	
}
