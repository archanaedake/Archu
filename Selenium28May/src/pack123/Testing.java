package pack123;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Code\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		
		
	}


}
