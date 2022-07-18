import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicPage {
    public void clickElement(By locator) throws Exception {getWebElement(locator).click();}

    public void sendKeysToElement(By locator, String text) throws Exception {getWebElement(locator).sendKeys(text);}

    private WebElement getWebElement(By locator) throws Exception {return Singleton.getDriverInstance().findElement(locator);}
}
