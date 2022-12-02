package man;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\JAYA BABU\\Downloads\\gecko\\gecko0driver.exe");
     
     WebDriver driver = new FirefoxDriver();

	}

}
