package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SharedSteps {
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
