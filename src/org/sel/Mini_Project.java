package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\munna\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.xpath("//a[@class='login']")).click();

		driver.findElement(By.id("email")).sendKeys("buviraj31@gmail.com");

		driver.findElement(By.id("passwd")).sendKeys("Akshatra@0703");

		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();

		WebElement t_shirt = driver.findElement(By.xpath("//img[contains(@title,'T-shirts')]"));

		Actions ac = new Actions(driver);

		ac.moveToElement(t_shirt).build().perform();

		ac.click(t_shirt).build().perform();

		WebElement Frame = driver.findElement(By.className("fancybox-iframe"));

		driver.switchTo().frame(Frame);

		driver.findElement(By.xpath("//button[@name='Submit']")).click();

		driver.switchTo().defaultContent();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("cgv")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("processCarrier")).click();

		driver.findElement(By.xpath("//a[@class='cheque']")).click();

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		Thread.sleep(2000);

		WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView()", back);

		js.executeScript("window.scrollBy(0,-600);");

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(("C:\\Users\\munna\\eclipse-workspace\\Selenium\\Screenshots\\pic4.png"));

		FileUtils.copyFile(source, destination);
		
		driver.close();

	}

}
