package generic_utlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
			driver= new ChromeDriver();
		return driver;
	}

}
