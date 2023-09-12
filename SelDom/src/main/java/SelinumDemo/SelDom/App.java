package SelinumDemo.SelDom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver wd=new ChromeDriver();
        // maximize window
        wd.manage().window().maximize();
        //open youtube
        wd.get("https://youtube.com");
        // do some stuff
        
        // close 
//        wd.close();
    }
}
