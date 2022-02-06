package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void switchWindowToChild()
	
	{
		Set<String> win1=driver.getWindowHandles();
		Iterator<String> it=win1.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
	}
}
