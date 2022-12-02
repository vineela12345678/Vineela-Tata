package man;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\JAYA BABU\\Downloads\\gecko\\geckodriver.exe");

		System.out.println("hello");
		

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		

	}

}
