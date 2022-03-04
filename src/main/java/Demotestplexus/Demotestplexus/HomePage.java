package Demotestplexus.Demotestplexus;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	

	public WebDriver driver;

	   @FindBy(xpath = "//span[contains(text(),'Sign In')]")
	    public WebElement Sign_In;

    public HomePage(WebDriver driver) {
    	this.driver=driver;
    	 PageFactory.initElements(driver, this);
    }
    
    public void Verify_Header() {
     String Title =  driver.getTitle();
     Assert.assertEquals(Title, "Weight Management, Nutrition, Personal Care Products | Plexus Worldwide®");
	}
    

       
       
}
