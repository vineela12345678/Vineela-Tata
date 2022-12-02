package man;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYA BABU\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.emirates.com/IN/english/book/?gclid=EAIaIQobChMIwt-u1J_z-gIVsJNmAh0yHgRsEAAYASAAEgKxpPD_BwE&gclsrc=aw.ds");
		driver.manage().window().minimize();


        
        List<WebElement> links = driver.findElements(By.tagName("a"));// direct links
        System.out.println(links.size());//total link sizes
        int total=links.size();
        int visible=0;
        
        for(int i=0;i<links.size();i++)
        {
        	if(links.get(i).isDisplayed())
        	{
        		visible++;
        	}
        }
        System.out.println("visible links" +visible);// visible links
        System.out.println("unvisisble links" +(total-visible));//unvisible links
        		
        		
        		
        		
        
        
        
        
	}

}
