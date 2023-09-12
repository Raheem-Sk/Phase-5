package Selinum.AutomatewithSelinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
	public static void main(String[] args) {

		// register chrome driver
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		// create an object to the driver to access the browser componenets
		WebDriver wd = new ChromeDriver();
		// maximize the browser
		wd.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
		wd.get("http://127.0.0.1:5500/register.html");
		wd.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
		// wd.findElement(By.name("op")).sendKeys("JAVA");
		Alert alert = wd.switchTo().alert();
		alert.accept();
		wd.findElement(By.id("id")).sendKeys("123");
		wd.findElement(By.id("name")).sendKeys("Shaik Raheem");
		wd.findElement(By.id("email")).sendKeys("shaik.raheem@gmail.com");
		wd.findElement(By.id("password")).sendKeys("PassisWord");
		wd.findElement(By.id("dob")).sendKeys("01-01-1990");
		wd.findElement(By.name("cricket")).click();
		wd.findElement(By.id("m")).click();
		Select sc = new Select(wd.findElement(By.name("op")));
		// sc.selectByIndex(1);
		sc.selectByVisibleText("JAVA");
		wd.findElement(By.id("textspace")).sendKeys("NEOM city,Dubai,UAE.");
		wd.findElement(By.id("textspace")).submit();

	}
}
