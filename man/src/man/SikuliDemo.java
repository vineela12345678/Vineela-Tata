package man;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SikuliDemo {
	WebDriver driver;
	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		HashMap<String, Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.prompt_for_download", true);
		ChromeOptions options  = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		driver.get("http://www.selenium.dev/downloads");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void operation() throws InterruptedException, FindFailed
	{
		driver.findElement(By.linkText("4.6.0")).click();
		Screen sc = new Screen();
		Pattern saveBtn = new Pattern("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\save.png");
		Thread.sleep(3000);
		sc.click(saveBtn);
	}

}
