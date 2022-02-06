package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException
	
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		String url=pro.getProperty("QAUrl");
		if(driver==null)
		{
			
			if(pro.getProperty("browser").equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
			}
			else if(pro.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
		
		return driver;
		
		
	}
}
