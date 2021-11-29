package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
            String title = driver.getTitle();
            
            System.out.println(title);
            
            String cu = driver.getCurrentUrl();
            
            System.out.println(cu);
			
            //Navigation Methods
            
            driver.navigate().to("https://www.youtube.com/");
            
            Thread.sleep(3000);
            
            driver.navigate().back();
            
            Thread.sleep(2000);
            
            driver.navigate().forward();
            
            Thread.sleep(5000);
            
            driver.navigate().refresh();
            
            Thread.sleep(3000);
            
            driver.close();

	}
}


