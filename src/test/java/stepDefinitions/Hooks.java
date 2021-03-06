package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	public TestContextSetUp testcontestSetup;
	public Hooks(TestContextSetUp testcontestSetup)
	{
		this.testcontestSetup=testcontestSetup;
	}
	
	@After
	
	public void AfterTest() throws IOException
	{
		testcontestSetup.testBase.webDriverManager().quit();;
		
	}
	@AfterStep
	
	public void AddScreenShot(Scenario scenario) throws IOException
	
	{
		WebDriver driver=testcontestSetup.testBase.webDriverManager();
		if(scenario.isFailed())
		{
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent= FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(filecontent, "image/png","image");
		}
	}

}
