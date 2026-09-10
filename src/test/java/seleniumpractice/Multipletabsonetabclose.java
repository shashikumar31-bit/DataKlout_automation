package seleniumpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabsonetabclose {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.get("https://dataklout.ai/login");
		Thread.sleep(20000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://chatgpt.com/c/6a45fa18-a6ec-83e8-9c95-eb7210dc9134");
		Thread.sleep(20000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://dataklout.ai/access-logs");
		Set<String> ids=driver.getWindowHandles();
		List<String> tabs=new ArrayList<>(ids);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(20000);
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}

}
