package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public  class BaseModal extends BasePage {

    public BaseModal(WebDriver driver) {
        super(driver);
    }

    private final static By SAVE_BUTTON = By.xpath("//button[@class='slds-button slds-button_brand']");
    private final static By SAVE_AND_NEW_BUTTON = By.name("SaveAndNew");
    private final static By CANCEL_BUTTON = By.name("CancelEdit");

    public void scrollIntoView(WebElement element)  {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickSaveButton()   {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void clickSaveAndNuwButton() {
        driver.findElement(SAVE_AND_NEW_BUTTON).click();
    }

    public void clickCancelButton() {
        driver.findElement(CANCEL_BUTTON).click();
    }



}
