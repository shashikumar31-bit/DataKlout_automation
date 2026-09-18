package tests; Testing real12345

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrive {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://155.248.248.244/login");
	driver.manage().window().fullscreen();
	Thread.sleep(10000);
	driver.navigate().back();
	Thread.sleep(20000);
	driver.navigate().forward();
	Thread.sleep(10000);
	driver.navigate().refresh();
	


		
	}

}
