package WebBrowserRegistration.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class UserInfo {
    WebDriver driver;
    public UserInfo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "fname")
    WebElement userName;

    @FindBy(id = "lname")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "passwordConfirmation")
    WebElement passwordConfirmation;

    @FindBy(id = "diceCommunications")
    WebElement radioButton;

    public void enterUsernameAndPass(){
        //Legal Name
        userName.sendKeys("GrabData[0]");
        lastName.sendKeys("GrabData[1]");
        //User Email:
        userEmail.sendKeys("loremimdzkkpxxsum@gmail.com");
        //User Password:
        password.sendKeys("GrabData[3]");
        passwordConfirmation.sendKeys("GrabData[3]");
    }

    public void radioButtonValidator(){
        //Checks if Enabled:
        boolean isRadioButtonEnabled = radioButton.isEnabled();
        if(isRadioButtonEnabled){
            radioButton.click();
        }
    }
    public CaptchaVerification completeUserRegistration() throws IOException {
        enterUsernameAndPass();
        radioButtonValidator();
        return new CaptchaVerification(driver);
    }
}
