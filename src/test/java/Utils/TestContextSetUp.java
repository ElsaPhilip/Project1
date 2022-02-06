package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
    public String landingpageProduct;
    public PageObjectManager pageObjectManger;
    public TestBase testBase;
    public GenericUtils genericUtils;
    
    public TestContextSetUp() throws IOException
    {
    	testBase=new TestBase();
    	pageObjectManger=new PageObjectManager(testBase.webDriverManager());
    	genericUtils=new GenericUtils(testBase.webDriverManager());
    }
}
