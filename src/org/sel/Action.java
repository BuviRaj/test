package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
    
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://automationpractice.com/index.php");
			
			WebElement Dressess = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
			
			Actions ac=new Actions(driver);
			
			ac.moveToElement(Dressess).build().perform();
			
			WebElement Summer_Dresses = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
			
			ac.click(Summer_Dresses).build().perform();
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
