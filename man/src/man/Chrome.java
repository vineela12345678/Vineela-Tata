package man;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.co.in/");

	}

}
