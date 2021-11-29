package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.leafground.com/pages/drop.html");
			
			Actions a = new Actions(driver);
			
			WebElement source = driver.findElement(By.id("draggable"));
			
			WebElement target = driver.findElement(By.id("droppable"));
			
			a.dragAndDrop(source, target).build().perform();
			
	}

}
