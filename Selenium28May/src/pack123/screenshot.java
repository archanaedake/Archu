package pack123;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	public static void main(String[] args) {
		System.out.println("webdriver.chrome.driver","E:\\Automation Code\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com");
		for(int i=1; i<5;i++)
		{
			TakesScreenshot take =(TakesScreenshot) driver;
			File src = take.getScreenshotAs(OutputTpe .FILE);
			File dest = new File()
					FileHandler.copy(src,dest);
		}
		
	}

}
