package Selinum.timebounds;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	 @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws InterruptedException, IOException
	    {
	    	WebDriver wd=null;
	       // register chrome driver 
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    //create an object to the driver to access the browser componenets 
	    	wd=new ChromeDriver();
	    	//maximize the browser 
	    	wd.manage().window();
	    	wd.get("https://www.ilovepdf.com/word_to_pdf");
	    	wd.findElement(By.id("pickfiles")).click();
	    	
	    	Runtime.getRuntime().exec("F:\\a.exe");
	    	
	    }	

}
