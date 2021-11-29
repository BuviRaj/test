package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_dropdown {	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Buvi");
		
		driver.findElement(By.name("lastname")).sendKeys("Raj");

        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("25879456");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Akshatra@0703");
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select s =new Select(date);
		
		s.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 =new Select(month);
		
		s1.selectByIndex(4);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 =new Select(year);
		
		s2.selectByVisibleText("1995");
		
		boolean multi= s.isMultiple();
		
		System.out.println("Is Multiple or not:" +multi);
		
		List<WebElement> opt = s.getOptions();
		
		for(WebElement webElement:opt) {
			
			String text = webElement.getText();
			
			System.out.println(text);
			
		}
		System.out.println("-------------------------");
		
		WebElement fso=s2.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
		}
		
		
		
		
		

}