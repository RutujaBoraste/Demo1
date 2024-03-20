import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Project\\selenium_jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
