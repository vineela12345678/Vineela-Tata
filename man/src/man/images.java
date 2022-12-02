package man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class images {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("lotus images");	
		driver.findElement( By.xpath("(//input[@class='gNO89b' and  @name='btnK'])[2]")).click();
		
		}

}
