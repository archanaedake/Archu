package pack123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Code\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();

}
