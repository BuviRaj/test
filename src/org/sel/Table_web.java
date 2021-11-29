package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_web {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		System.out.println("---------------------All Datas------------------");
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement webElement : all_data) {
			
			String text = webElement.getText();
			
			System.out.println(text);
			
		}
		System.out.println("----------------Row Datas----------------");
		
		List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		for (WebElement row : row_data) {
			
			String text = row.getText();
			
			System.out.println(text);
			
		}
		System.out.println("-----------------Column Datas-------------");
		
		List<WebElement> column_data = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		
		for (WebElement column : column_data) {
			
			System.out.println(column.getText());
		}
		System.out.println("---------------Particular Data--------------");
		
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[5]/td[6]"));
		
		System.out.println(particular.getText());
		
		System.out.println("------------Header Data--------------");
		
		List<WebElement> header_data = driver.findElements(By.xpath("//table/tbody/tr/th"));
		
		for (WebElement header : header_data) {
			
			System.out.println(header.getText());
			
		}
		
	}
	
	
	

}
