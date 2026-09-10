package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dataklout.ai/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Set<String> Windowids=driver.getWindowHandles();
		Thread.sleep(15000);
		
		for( String IDS:Windowids)
		{
			driver.switchTo().window(IDS);
		
		System.out.println(driver.getTitle()+"- "+ IDS);
		
		
	}
		driver.quit();
	}
}
