package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePageObject{

    private String securePageUrl = "https://the-internet.herokuapp.com/secure";
    private By logOutButton = By.xpath("//a[@class='button secondary radius']");
    private By message = By.id("flash");

    public SecureAreaPage(WebDriver driver, Logger log){
        super(driver, log);
    }

    /** Get URL variable from PageObject */
    public String getSecurePageUrl() {
        return securePageUrl;
    }

    /** Verification if logOutButton is visible on the page */
    public boolean isLogOutButtonVisible() {
        return find(logOutButton).isDisplayed();
    }

    /** Return text from success message */
    public String getSuccessMessageText() {
        return find(message).getText();
    }


}
