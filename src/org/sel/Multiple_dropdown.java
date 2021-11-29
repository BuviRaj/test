package org.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multidrop = driver.findElement(By.xpath(("(//select)[6]")));
		
		Select s=new Select(multidrop);
		
		s.selectByIndex(1);
		
		s.selectByValue("3");
		
		s.selectByVisibleText("Loadrunner");
		
		Thread.sleep(2000);
		
		s.deselectByValue("3");
		
	  //s.deselectAll();
		
		boolean multiple = s.isMultiple();
		
		System.out.println("Is multiple or not:" +multiple);
		
		System.out.println("----------------------------");
		
		List<WebElement> opt = s.getOptions();
		
		for(WebElement webElement:opt) {
			
			String text = webElement.getText();
			
			System.out.println(text);
			
		//	System.out.println(webElement.getText());
		}
		
		System.out.println("------------------------------");
		
		List<WebElement> alsec = s.getAllSelectedOptions();
		
		for(WebElement webElement:alsec) {
			
		   System.out.println(webElement.getText());
		
		}
		
		System.out.println("----------------------------------");
		
		WebElement fso = s.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
		driver.close();
	}

}
