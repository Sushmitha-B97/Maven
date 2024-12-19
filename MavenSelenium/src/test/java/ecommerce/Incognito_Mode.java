package ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito_Mode {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("_ _incognito ");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com/");
}
}