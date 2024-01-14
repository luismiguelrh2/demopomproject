package com.demo.www.pageobjects;


import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("https://demo.serenity.is/")

public class LoginPageObject extends PageObject {

    By txtUser = By.xpath("//input[@name='Username']");
    By txtPassword = By.xpath("//input[@name='Password']");
    By btnLogin = By.xpath("//button[@id='LoginPanel0_LoginButton']");
    By txtDashboard = By.xpath("//h1");
}
