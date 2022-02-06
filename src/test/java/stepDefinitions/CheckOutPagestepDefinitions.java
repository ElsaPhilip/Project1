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

public class CheckOutPagestepDefinitions {
	
	public WebDriver driver;
public String landingpage;
public String Offerpage;
 TestContextSetUp testcontestSetup;
public PageObjectManager pageObjectManger;
public CheckOutPage checkoutPage;

public CheckOutPagestepDefinitions(TestContextSetUp testcontestSetup)
{
	this.testcontestSetup=testcontestSetup;
	checkoutPage=testcontestSetup.pageObjectManger.getcheckoutPage();
}
	
@Then("^: Proceed to chekoutPage and validate (.+) in the chekout page$")
public void _proceed_to_chekoutpage_and_validate_in_the_chekout_page(String name) throws Throwable {
	checkoutPage.SelectBag();
	//Thread.sleep(2000);
	checkoutPage.ClickProceedToCheckOut();
	//Thread.sleep(2000);
	String chekoutVegname=checkoutPage.getVegname().split("-")[0].trim();
	Assert.assertTrue(chekoutVegname.contains(name));

	
	
	
   
}

@And("^: Verify user has the provision to enter Promo code and place order$")
public void _verify_user_has_the_provision_to_enter_promo_code_and_place_order() throws Throwable {
   
	
	Assert.assertTrue(checkoutPage.verifyPromocodePresent());
	Assert.assertTrue(checkoutPage.VerifyPlaceOrderPresent());
}
	

}
