package Demotestplexus.Demotestplexus;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	  private WebDriver driver;
  @BeforeTest
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://plexusworldwide.com");
        
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    } 

    @Test
    public void Get_Title() 
    {
    	HomePage HomePage =new HomePage(driver);
    	HomePage.Verify_Header();
    	HomePage.Sign_In.click();
    	String url = driver.getCurrentUrl();
    	Assert.assertTrue(url.contains("login"));
    }
  
}
