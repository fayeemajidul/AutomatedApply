package WebBrowserRegistration.Automation;

import WebBrowserRegistration.GlobalResources.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class registrationFramework implements WebDriver {
    @Test
    public void RegistrationImplementation() throws InterruptedException, IOException {
        InitDriver initDriver = new InitDriver();
        LandingPage landingPage = initDriver.launchPage();
        UserInfo userInfo = landingPage.navigateToUserPage();
        CaptchaVerification captchaVerification = userInfo.completeUserRegistration();
        captchaVerification.avoidCaptcha();
    }
    @Override
    public void get(String url) {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}