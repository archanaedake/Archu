package pack123;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingg {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Code\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Dimension d = new Dimension(300, 700);
		
		//driver.manage().window().setSize(d);
		//Thread.sleep(3000);
		Point p =new Point(800,500);
		driver.manage().window().setPosition(p);
		
		
}
}
