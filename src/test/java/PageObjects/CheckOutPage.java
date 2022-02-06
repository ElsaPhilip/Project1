package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	public WebDriver driver; 
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Bag=By.cssSelector("[alt='Cart']");
	By ProceedToCheckOut=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By promoCode=By.cssSelector(".promoCode");
	By placeOrder=By.xpath("//button[text()='Place Order']");
	By VegName=By.cssSelector(".product-name");
		
	
	
	public void SelectBag()
	{
		
		driver.findElement(Bag).click();
		
	}
	
	public void ClickProceedToCheckOut()
	{
		
		driver.findElement(ProceedToCheckOut).click();
		
	}
	
	public boolean verifyPromocodePresent()
	{
		return driver.findElement(promoCode).isDisplayed();
	}
	
	public boolean VerifyPlaceOrderPresent()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	public String getVegname()
	{
		return driver.findElement(VegName).getText();
	}
}