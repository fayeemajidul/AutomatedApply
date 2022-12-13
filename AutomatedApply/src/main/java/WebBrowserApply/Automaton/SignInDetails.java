package WebBrowserApply.Automaton;

import WebBrowserApply.GlobalResources.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInDetails extends AbstractWaits {
    WebDriver driver;
    public SignInDetails(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Sign In']")
    WebElement signInHeader;
    By headerSignIn = By.xpath("//h1[normalize-space()='Sign In']");

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;


    public void signInDetails(){
        visibilityOf(headerSignIn);
        email.sendKeys("fayeemtests@gmail.com");
        password.sendKeys("King1234!");
        submitBtn.click();

    }

    public FilterJobSelection searchJobRole(){
        signInDetails();
        return new FilterJobSelection(driver);
    }

}