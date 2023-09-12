package com.test;


public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
    	WebDriver wd=null;
       // register chrome driver 
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\Downloads\\chromedriver-win32\\chromedriver.exe");
    //create an object to the driver to access the browser componenets 
    	wd=new ChromeDriver();
    	//maximize the browser 
    	wd.manage().window().maximize();
    	wd.manage().timeouts().pageLoadTimeout(4000, TimeUnit.MILLISECONDS);
    	wd.get("https://www.ilovepdf.com/word_to_pdf");
    	wd.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
    	Runtime.getRuntime().exec("F:\\FileUpload.exe");
    	
    }	
}


