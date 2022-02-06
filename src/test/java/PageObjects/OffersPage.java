package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By search=By.id("search-field");
	
	
	
	
	public void SearchItem(String item)
	{
		
		driver.findElement(search).sendKeys(item);
	}
	
}
