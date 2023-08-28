package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class BasePage {

    public  WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public  void clickOnAElement(By locator){
        getElement(locator).click();
    }

    public void writeOnByLocator(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
       return getElement(locator).getText();
    }

    public String getTitle() {
        return getDriver().getTitle();
    }


    public void timeOut(int duretionMS) {
        try {
            Thread.sleep(duretionMS);
        } catch ( InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void timeOut() {
        try {
            Thread.sleep(2000);
        } catch ( InterruptedException e) {
            e.printStackTrace();
        }
    }


    public  boolean  is_element_visibility(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));



    }

}
