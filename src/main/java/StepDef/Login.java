package StepDef;

import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login
{
    @Given("I Lunch chrome browser")
    public void i_lunch_chrome_browser() {
        System.out.println("the browser");
    }

    @When("I open HRM HomePage")
    public void i_open_hrm_home_page() throws InterruptedException
    {
        LoginPage.getInstance().logincrt("Admin","admin123");
    }

    @Then("I Verify logo present on page")
    public void i_verify_logo_present_on_page() {
        System.out.println("Login page present");
    }

    @Then("Close Browser")
    public void close_browser() {
        System.out.println("Browser closed");
    }
}
