package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class CreateAccountPage2 {

    @FindBy(id = "ownerCpf")
    private WebElement cpfText;

    @FindBy(className = "sb-button")
    private WebElement createBtn;

    @FindBy(id = "sb-return-message")
    private WebElement message;

    public CreateAccountPage2 cpf (String cpf){
        cpfText.clear();
        String [] elements = cpf.split("");
        for (String c:elements)
        {
            cpfText.sendKeys(c);
        }
       // cpfText.sendKeys(cpf);
        return this;
    }

    public CreateAccountPage2 createAccount (){
        createBtn.click();
        return this;
    }

    public String returnMessage(){
        return message.getText();
    }
}
