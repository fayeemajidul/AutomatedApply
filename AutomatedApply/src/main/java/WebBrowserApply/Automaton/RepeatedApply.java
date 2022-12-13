package WebBrowserApply.Automaton;

import WebBrowserApply.GlobalResources.AbstractWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepeatedApply extends AbstractWaits {
    WebDriver driver;
    public RepeatedApply(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver returnDriver(){
        return driver;
    }
    @FindBy(css = "#navbarDropdown-8")
    WebElement dropDownToggle;

    @FindBy(xpath = "//a[@class = 'ng-binding']")
    WebElement firstJobToAppearOnPage;

    @FindBy(css = "a[href='/dashboard/jobs']")
    WebElement unsaveBtn;

    public void goBackToSaved(){
        dropDownToggle.click();
        goBackToSavedJobs();
    }
    public void unsaveJob(){
        firstJobToAppearOnPage.click();
        unsaveBtn.click();
    }
    public void connectSteps(){
        goBackToSaved();
        unsaveJob();
    }

}
