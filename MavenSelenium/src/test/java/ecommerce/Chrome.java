package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
@Test
public void test() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("_ _disable_ _notifications");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://www.facebook.com/");
}
}
