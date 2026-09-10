package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://dataklout.ai/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your User Id']")).sendKeys("GNLMNDVD01");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("Welcome/2026#DAVID");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='checkbox-container']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(20000);
		if(driver.getTitle().equals("DataKlout"))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login failed");
		}
		driver.quit();
	}
}
