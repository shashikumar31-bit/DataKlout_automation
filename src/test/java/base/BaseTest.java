package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver;
	public static void LaunchBrowser() throws InterruptedException
    {
    driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	Thread.sleep(10000);
    	driver.get("https://dataklout.ai/login");
      
    }
}




