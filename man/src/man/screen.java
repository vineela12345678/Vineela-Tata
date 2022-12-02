package man;

import java.io.File;

import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.OutputType;


import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().minimize();
		
		//webdriver
//		TakesScreenshot tc = (TakesScreenshot) driver;
//		File sc = tc.getScreenshotAs(OutputType.FILE);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\screen\\vineela1.jpg");
//		Files.copy(sc, path);
		
		//base64
//		String tc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//		byte[] sc = Base64.getDecoder().decode(tc);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\screen\\face.png");
//		FileOutputStream fos = new FileOutputStream(path);
//		fos.write(sc);
		
		
		// chrome driver
//	File src = driver.getScreenshotAs(OutputType.FILE);
//	File path = new File("C:\\Users\\JAYA BABU\\Desktop\\screen\\vineela3.jpg/");
//	Files.copy(src, path);
	
		String src = driver.getScreenshotAs(OutputType.BASE64);
		byte[] sc = Base64.getDecoder().decode(src);
	File path = new File("C:\\Users\\JAYA BABU\\Desktop\\screen\\vineela4.jpg/");
		

	}

}
