package resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class base 
{
	public WebDriver driver;
	public WebDriver InitialiseDriver() throws IOException
	{
		
		//String homedir = System.getProperty("User.dir");      // Retrieve Working Directory          
		//FileInputStream fis = new FileInputStream(homedir + "//src//main//java//temp//data.properties");
		//FileInputStream fis = new FileInputStream("//Users//yuvensharma//eclipse-workspace//SpringD//src//main//java//temp//data.properties");
		FileInputStream fis = new FileInputStream("//Users//yuvensharma//git//SeleniumJava1//SpringD//src//main//java//temp//data.properties");

		                            // *** Get values from property file ***
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println("fis" + fis);
		String browsername = prop.getProperty("browser");
		System.out.println("browser " + browsername);


		if(browsername.equals("chrome"))                                    // *** Invoke chrome browser ***
		{		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{		
			// firefox code
		}
		else if(browsername.equals("IE"))
		{		
			// IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String urlname = prop.getProperty("url");
		driver.get(urlname);
		driver.manage().window().maximize();
		return driver;
	}



}