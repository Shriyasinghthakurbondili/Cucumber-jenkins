package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedStepsSearchPage {

public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	
	@Before
	public void Setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		
    @After
    public void teardown() {
        // Perform cleanup after each scenario.
        driver.quit();
    }
}
