package man;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class san {
	

public static void main(String[] args) throws InterruptedException
{
		System.out.println("hello world");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
	System.out.println(driver.getWindowHandle());
		driver.navigate().to("https://www.bing.com/");
		

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
     	driver.navigate().forward();
	Thread.sleep(2000);
		driver.navigate().refresh();
	Thread.sleep(2000);
	driver.quit();
		
}
	
}
