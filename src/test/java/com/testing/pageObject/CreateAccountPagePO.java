package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element locator
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PassWordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPassWordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;

    //initialize web element using selenium
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //write java method to perform web element actions
    public void enterFirstName(String firstname){
        FirstNameField.sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        LastNameField.sendKeys(lastname);
    }

    public void enterEmail(String email){
        EmailField.sendKeys(email);
    }

    public void enterPassword(String password){
        PassWordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword){
        ConfirmPassWordField.sendKeys(confirmpassword);
    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }






}





