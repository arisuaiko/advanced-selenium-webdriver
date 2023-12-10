package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject{
    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By formAuthenticationLinkLocator = By.linkText("Form Authentication");

    private By checkboxesLink = By.linkText("Checkboxes");

    public WelcomePageObject(WebDriver driver, Logger log){
        super(driver, log);
    }

    /** Open WelcomePage with it's URL */
    public void openPage(){
        log.info("Opening page:" + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened");
    }

    /** Open LoginPage by clicking on Form Authentication link */
    public LoginPage clickFormAuthenticationLink() {
        log.info("Clicking Form Authentication Link on Welcome Page");
        click(formAuthenticationLinkLocator);
        return new LoginPage(driver, log);
    }

    /** Open CheckboxesPage with it's URL*/
    public CheckboxesPage clickCheckboxesLink(){
        log.info("Clicking Checkboxes link on Welcome Page");
        click(checkboxesLink);
        return new CheckboxesPage(driver,log);
    }
}
