package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {

    // Element locator
    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PassWordField;

    @FindBy (css = "#send2 > span")
    public static WebElement SignInButton;

    //initialize web element using selenium
    public SignInPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //write java method to perform web element actions
    public void enterEmail(String email){
        EmailField.sendKeys(email);
    }

    public void enterPassword(String password){
        PassWordField.sendKeys(password);
    }
    public void clickSignInButton(){
        SignInButton.click();

    }

















}
