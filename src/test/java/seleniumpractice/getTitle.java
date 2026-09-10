package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dataklout.ai/login");
	Thread.sleep(20000);
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(20000);
	driver.get("https://chatgpt.com/c/6a45fa18-a6ec-83e8-9c95-eb7210dc9134");
	Set<String> WindowIDs=driver.getWindowHandles();
	for(String ids:WindowIDs)
	{
		driver.switchTo().window(ids);
		System.out.println(driver.getCurrentUrl()+"-"+ids);
		
	}
	driver.quit();
		
}
}
