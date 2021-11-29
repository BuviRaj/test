package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Class {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("9791949043");
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("23@45c");
		
	//	pass.clear();
		
		boolean dis = email.isDisplayed();
		
		System.out.println("Is Displayed or not:" +dis);
		
		boolean en= email.isEnabled();
		
		System.out.println("Is enabled or not:" +en);
		
		boolean sel = email.isSelected();
		
		System.out.println("Is selected or not:" +sel);
		
		driver.findElement(By.name("login")).click();
		
	}
	
}
