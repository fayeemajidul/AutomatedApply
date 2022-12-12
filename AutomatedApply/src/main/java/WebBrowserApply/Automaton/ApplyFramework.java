package WebBrowserApply.Automaton;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ApplyFramework implements WebDriver {
    @Test
    public void AutoApply(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.dice.com/dashboard/login");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("fafag@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("King1234!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        //put a wait here until page loads.

        //New Page: (home Page)
        driver.findElement(By.id("typeaheadInput")).click();
        driver.findElement(By.id("typeaheadInput")).sendKeys("QA Automation Engineer");
        driver.findElement(By.id("typeaheadInput")).sendKeys(Keys.ENTER);

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(4));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDisplay-div")));


        //New Page Wait for Page to load
        boolean isSelected = driver.findElement(By.xpath("//button[@aria-label='Filter Search Results by Remote Only']//i[@class='fa fa-square-o']")).isSelected();
        if(!isSelected){
            driver.findElement(By.xpath("//button[@aria-label='Filter Search Results by Remote Only']//i[@class='fa fa-square-o']")).click();
        }
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
        boolean isEasyApplySelected = driver.findElement(By.cssSelector("i[class='fa fa-square-o']")).isSelected();
        if(!isEasyApplySelected){
            driver.findElement(By.cssSelector("i[class='fa fa-square-o']")).click();
        }
        javascriptExecutor.executeScript("window.scrollBy(0,-600)");
        //Install Wait Time until jobs Appear
        int numofBoxes = driver.findElements(By.cssSelector(".card.search-card")).size();

        driver.findElement(By.xpath("//dhi-search-card[1]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[2]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[3]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[4]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[5]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[6]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[7]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[8]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[9]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[10]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[11]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[12]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[13]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[14]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[15]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[16]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[17]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[18]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[19]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,10)");
        driver.findElement(By.xpath("//dhi-search-card[20]//div[1]//div[1]//div[1]//div[2]//div[2]//dhi-save-button[1]//div[1]//button[1]")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,-10000)");
        driver.findElement(By.id("smart-toggle-link")).click();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("smart-toggle")));
        driver.findElement(By.xpath("//a[normalize-space()='Jobs']")).click();


        //Click on JObs





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
