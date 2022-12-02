package man;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreen {
	  public static void capture(WebDriver driver , String name) throws IOException
	  {
		  File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      Files.copy(ts, new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\"+name +".png "));	 
	  }


	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:www.facebook.com/");
/*		
		//chromedriver methods
//		File src =  driver.getScreenshotAs(OutputType.FILE);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\img1.jpg");
//		Files.copy(src, path);
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kiran magneq");
		
//		String src = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] hari = Base64.getDecoder().decode(src);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\kiran.png");
//		FileOutputStream fos = new FileOutputStream(path);
//		fos.write(hari);
//		
		
//		byte[] src = driver.getScreenshotAs(OutputType.BYTES);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\kiranmagneq.jpg");
//		FileOutputStream fos = new FileOutputStream(path);
//		fos.write(src);
		
		//Webdriver method
//	
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\hari.png");
//		Files.copy(src, path);
 * 
 * 
 *      File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(ts, new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\mamu.jpg"));
    
    
		
        */
		//Base64
//		String ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//		byte[] kiran = Base64.getDecoder().decode(ts);
//		File path = new File("C:\\Users\\JAYA BABU\\Desktop\\sreenshots\\face.png");
//		FileOutputStream fos  = new FileOutputStream(path);
//		fos.write(kiran);
//		
		
		driver.navigate().to("https:www.amazon.com");
	    takeScreen.capture(driver, "kodali");
		
		
		
		
		
		 
	}

}

