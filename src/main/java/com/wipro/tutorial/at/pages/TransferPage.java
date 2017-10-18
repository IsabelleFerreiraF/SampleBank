package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class TransferPage extends AbstractPage {

    @FindBy(id = "sourceAccount")
    private WebElement fromAccountDropdown;

    @FindBy(id = "targetAccount")
    private WebElement toAccountDropdown;

    @FindBy(id = "ammount")
    private WebElement ammount;

    @FindBy(className = "sb-button")
    private  WebElement transferBtn;

    @FindBy(id = "sb-return-message")
    private WebElement message;

    public TransferPage selectDropdowFrom(String account){
        try {

            Select drpAccount = new Select(fromAccountDropdown);
            drpAccount.selectByVisibleText(account);
            wait(5000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return this;
    }

    public TransferPage selectDropdowTo(String account){
        try {

            Select drpAccount = new Select(toAccountDropdown);
            drpAccount.selectByVisibleText(account);
            wait(5000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return this;
    }

    public TransferPage fillAmomunt(String value){
        ammount.clear();
        ammount.sendKeys(value);

        return this;
    }

    public void clickTransfer(){
        transferBtn.click();
    }

    public String messageValid(){
        return message.getText();
    }


}
