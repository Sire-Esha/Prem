package StepDefinations;

import HomePage.AT01_NavigateToHNWebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToHNWebsite
{
    @Given("Navigate to Website and Assert")
    public void navigate_to_website_and_assert() throws IOException {
        AT01_NavigateToHNWebsite.Navigate();
    }
    @Then("Navigate to Account Screen")
    public void navigate_to_account_screen() {

       AT01_NavigateToHNWebsite.NavCreateAcc();
    }

}
