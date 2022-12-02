package man;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().minimize();
		WebElement drop = driver .findElement(By.id("themes"));
		List<WebElement>list = drop.findElements( By.tagName( "option"));
		
		Select obj = new Select(drop);
		obj.selectByIndex(8);
		System.out.println("Beach");
	}

}
