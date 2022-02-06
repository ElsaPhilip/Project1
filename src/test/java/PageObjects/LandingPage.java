package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver; 
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Search=By.xpath("//input[@type=\"search\"]");
	By Productname=By.xpath("//h4[@class=\"product-name\"]");
	By Deals=By.linkText("Top Deals");
	By Increment=By.cssSelector("a.increment");
	By AddToCart=By.xpath("//button[text()='ADD TO CART']");
	
	
	public void Search(String name)
	{
		
		driver.findElement(Search).sendKeys(name);
		
	}
	
	public String productname()
	{
	String landingpage=driver.findElement(Productname).getText().split("-")[0].trim();
	return landingpage;
}
	
	public void clickDeals()
	{
		
		driver.findElement(Deals).click();
	}
	
	public void Increment()
	{
		driver.findElement(Increment).click();
	}
	
	public void ClickAddToCart()
	{
		
		driver.findElement(AddToCart).click();
	}
	
}