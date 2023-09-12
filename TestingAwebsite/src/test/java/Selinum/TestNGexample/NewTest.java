package Selinum.TestNGexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver wd = null;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		// create an object to the driver to access the browser componenets
		wd = new ChromeDriver();
		// maximize the browser
		wd.manage().window().maximize();
	}

	@Test
	public void f1() {

		wd.get("https://www.simplilearn.com/");

	}

	@Test
	public void f2() {
		wd.get("https://www.amazon.in/");

	}

	@AfterTest
	public void close() {
		wd.close();
	}
}
