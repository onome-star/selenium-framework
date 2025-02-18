package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
    // Element locator
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAnAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    //initialize web element using selenium
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //write java method to perform web element actions
    public void clickCreateAccountLink(){
        CreateAnAccountLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();
    }







}
