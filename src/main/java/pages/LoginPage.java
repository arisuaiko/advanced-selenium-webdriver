package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage extends BasePageObject{

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.name("password");
    private By logInButtonLocator = By.tagName("button");

    private By errorMessageLocator = By.id("flash");

    public LoginPage(WebDriver driver, Logger log){
        super(driver, log);
    }

    /** Execute Log in */
    public SecureAreaPage logIn(String username, String password){
        log.info("Execute logIn with username [" + username + "] and password ["+ password +"]");
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
        return new SecureAreaPage(driver,log);
    }

    /** Execute negative Log in */
    public void negativeLogIn(String username, String password){
        log.info("Execute logIn with username [" + username + "] and password ["+ password +"]");
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
    }

    /** Wait to the error message to be visible on the page */
    public void waitForErrorMessage(){
        waitForVisibilityOf(errorMessageLocator, Duration.ofDays(5));
    }

    public String getErrorMessageText(){
        return find(errorMessageLocator).getText();
    }
}
