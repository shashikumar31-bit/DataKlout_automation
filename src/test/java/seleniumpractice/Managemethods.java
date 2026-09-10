package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethods {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://dataklout.ai/login");
	driver.manage().window().maximize();
	Thread.sleep(20000);
	driver.manage().window().minimize();
	Thread.sleep(20000);
	driver.manage().window().fullscreen();
	Thread.sleep(20000);
	driver.manage().deleteAllCookies();
	driver.quit();
	
}
}
