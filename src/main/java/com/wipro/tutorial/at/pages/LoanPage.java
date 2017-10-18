package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class LoanPage extends AbstractPage {

    @FindBy(name = "targetAccount")
    private WebElement accountDropdown;

    @FindBy(id = "ammount")
    private WebElement ammount;

    @FindBy(className = "sb-button")
    private  WebElement depositBtn;

    @FindBy(id = "sb-return-message")
    private WebElement message;

    public LoanPage selectDropdown(String account){
        try {

            Select drpAccount = new Select(accountDropdown);
            drpAccount.selectByVisibleText(account);
            wait(5000);
        } catch (Exception e){
            e.getStackTrace();
        }
        return this;
    }

    public LoanPage fillAmount(String value){
        ammount.clear();
        ammount.sendKeys(value);
        return this;
    }

    public void clickDeposit(){
        depositBtn.click();
    }

    public String messageValid(){
        return message.getText();
    }
}
