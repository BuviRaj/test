package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", amazon_logo);
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-5000);");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,5000);");
	}

}
