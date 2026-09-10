package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfconditionNavigationmethods {
public static void main(String[] args) throws InterruptedException
{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://dataklout.ai/login");
    Thread.sleep(20000);
    driver.navigate().to("https://www.youtube.com/");
    Thread.sleep(20000);
    driver.navigate().back();
    Thread.sleep(20000);
    driver.navigate().forward();
    if(driver.getCurrentUrl().equals("https://www.youtube.com/"))
    {
    	System.out.println("Correct URL");
    }
    else
    	{
    	System.out.println("Incorrect URL");
    }
    driver.quit();
}
}
