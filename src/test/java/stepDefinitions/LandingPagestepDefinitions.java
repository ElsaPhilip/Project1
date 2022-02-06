package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.CheckOutPage;
import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPagestepDefinitions {
	
public WebDriver driver;
public String landingpageProduct;
public String Offerpage;
 TestContextSetUp testcontestSetup;
public PageObjectManager pageObjectManger;
public LandingPage landingpage;



public LandingPagestepDefinitions(TestContextSetUp testcontestSetup)
{
	this.testcontestSetup=testcontestSetup;
	landingpage=testcontestSetup.pageObjectManger.getLandingPage();
	//checkoutPage=testcontestSetup.pageObjectManger.getcheckoutPage();
}
	@Given(": User is in landing page")
	public void user_is_in_landing_page() {

		
		
	}

	 @When("^: User enter (.+) in the search page$")
	public void _user_enter_something_in_the_search_page(String strArg1) throws Throwable {
		//LandingPage landingpage=new LandingPage(testcontestSetup.driver);
		
		//LandingPage landingpage=new LandingPage();
	
		landingpage.Search(strArg1);
		//testcontestSetup.driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(strArg1);
		Thread.sleep(3000);
		testcontestSetup.landingpageProduct = landingpage.productname();
		//System.out.println(str);
		//Assert.assertTrue(str.contains(strArg1));

	}
	
	 @And("^: Add \"([^\"]*)\" items into the cart$")
	    public void _add_something_items_into_the_cart(String strArg1) throws Throwable {
	       
		
		 int j=Integer.parseInt(strArg1);
		 for(int i=0;i<j;i++)
		 {
		 landingpage.Increment();

		 }
		 landingpage.ClickAddToCart();
		 
		 Thread.sleep(3000);
}
}
