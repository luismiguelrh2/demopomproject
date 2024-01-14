package com.demo.www.steps;

import com.demo.www.pageobjects.LoginPageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class LoginStep {

    LoginPageObject loginPageObject = new LoginPageObject();


    @Step
    public void openBrowser () {
        loginPageObject.open();
    }
    @Step
    public void enterUser (String username){
        WebElement userName = loginPageObject.getDriver().findElement(loginPageObject.getTxtUser());
        userName.clear();
        userName.sendKeys(username);//Se crea objeto userName de la interfaz Webelement para poder interactuar con el elemento
    }
    @Step
    public void enterPassword (String password){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtPassword()).clear();
        loginPageObject.getDriver().findElement(loginPageObject.getTxtPassword()).sendKeys(password);
    }
    @Step
    public void clickLogin (){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnLogin()).click();
    }

    @Step
    public void validateDashboard() {
        String ValidateDashboard = loginPageObject.getDriver().findElement(loginPageObject.getTxtDashboard()).getText();
        Assert.assertTrue(ValidateDashboard.contains("Tablero"));}
}
