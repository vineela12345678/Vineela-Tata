package man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/?gclid=EAIaIQobChMItMLH6dHn-gIVBhBgCh2CtAJ_EAAYASAAEgK4FvD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='  login-form login-modal']")).click();
		
		driver.findElement(By.name("username")).sendKeys("mobilenumber");
		//driver.findElement(By.name("")).sendKeys("");
		
		//driver.findElement(By.xpath("")).click();
		
		
		

	}

}
