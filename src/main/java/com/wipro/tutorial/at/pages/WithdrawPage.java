package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class WithdrawPage {
    @FindBy(id = "targetAccount")
    private WebElement accountDropdown;

    @FindBy(id = "ammount")
    private WebElement ammount;


    @FindBy(className = "sb-button")
    private WebElement withdrawBtn;

    @FindBy(id = "sb-return-message")
    private WebElement message;

    public WithdrawPage selectAccount(String account){
        Select drpAccount = new Select(accountDropdown);
        drpAccount.selectByVisibleText(account);
        return this;
    }

    public WithdrawPage fillAmount(String ammountValue){
        ammount.sendKeys(ammountValue);
        return this;
    }

    public void clickWithdraw(){
        withdrawBtn.click();
    }

    public String message(){
        return message.getText();
    }
}
