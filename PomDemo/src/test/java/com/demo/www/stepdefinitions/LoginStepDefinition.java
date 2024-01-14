package com.demo.www.stepdefinitions;

import com.demo.www.models.LoginData;
import com.demo.www.pageobjects.LoginPageObject;
import com.demo.www.steps.LoginStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static com.demo.www.models.LoginData.setData;

public class LoginStepDefinition {


    @Steps
    LoginStep steps = new LoginStep();


    @Given("the user id in demo login page")
    public void theUserIdInDemoLoginPage() {
        WebDriverManager.chromedriver().setup();
        steps.openBrowser();


    }

    @When("the user puts correct credentials")
    public void theUserPutsCorrectCredentials(DataTable table) {
        steps.enterUser(LoginData.setData(table).get(0).getUsername());
        steps.clickLogin();


    }


    @Then("^user can see (.*)$")
    public void userCanSeeDashboard(String dashboard)  {
        steps.validateDashboard();

    }

}

