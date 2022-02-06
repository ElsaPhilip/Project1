package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utils.TestBase;
import Utils.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPagestepDefinitions {
	WebDriver driver;
public String landingpageProduct;
public String Offerpage;
public PageObjectManager pageObjectManger;
public OffersPage offepage;
public LandingPage landingpage;

	/*public OfferPagestepDefinitions(WebDriver driver2, String landingpage2) {
	this.driver=driver2;
	this.landingpage=landingpage2;
}
*/
TestContextSetUp testcontestSetup;
public OfferPagestepDefinitions(TestContextSetUp testcontestSetup)
{
	this.testcontestSetup=testcontestSetup;
	landingpage=testcontestSetup.pageObjectManger.getLandingPage();
	offepage=testcontestSetup.pageObjectManger.getOfferPage();
}


	@Then("^: (.+) is diaplayed$")
	public void _something_is_diaplayed(String strArg1) throws Throwable {
		Thread.sleep(3000);
		//OffersPage offepage=new OffersPage(testcontestSetup.driver);
		//offepage.clickDeals();
		//LandingPage landingpage=new LandingPage(testcontestSetup.driver);
		//PageObjectManager pageObjectManger=new PageObjectManager(testcontestSetup.driver);
		
		
		landingpage.clickDeals();
		
		pageswitching();
		Thread.sleep(3000);
		//testcontestSetup.driver.findElement(By.linkText("Top Deals")).click();
		
		//OffersPage offepage=new OffersPage(testcontestSetup.driver);
		//offepage=testcontestSetup.pageObjectManger.getOfferPage();
		offepage.SearchItem(strArg1);
		Thread.sleep(2000);
		//testcontestSetup.driver.findElement(By.id("search-field")).sendKeys(strArg1);
		//testcontestSetup.driver.manage().window().fullscreen();
		Offerpage=offepage.driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]")).getText();
		//Offerpage=testcontestSetup.driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]")).getText();
		//Assert.assertTrue(veg.contains(strArg1));
	}

	
	/*public void pageswitching()
	{
		Set<String> win1=testcontestSetup.driver.getWindowHandles();
		Iterator<String> it=win1.iterator();
		String parent=it.next();
		String child=it.next();
		testcontestSetup.driver.switchTo().window(child);
		
		}
		*/
	public void pageswitching()
	{
		
		testcontestSetup.genericUtils.switchWindowToChild();
		
		}
	
	
	@And("^: Offer page displays the veg name$")
    public void _offer_page_displays_the_veg_name() throws Throwable {
		Offerpage=offepage.driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]")).getText();
       
		System.out.println(Offerpage);
		Assert.assertEquals(testcontestSetup.landingpageProduct, Offerpage);
    }

}
