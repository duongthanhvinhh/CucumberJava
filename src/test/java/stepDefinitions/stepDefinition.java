package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("User open browser and access to facebook")
    public void user_open_browser_and_access_to_facebook() throws Throwable {
        System.out.println("step 1");
    }

    @When("User input phone number and password")
    public void userInputPhoneNumberAndPassword() {
        System.out.println("step 2");
    }

    @And("User click Login")
    public void userClickLogin() {
        System.out.println("step 3");
    }

    @Then("Verify User can access to facebook newfeeds successfully")
    public void verifyUserCanAccessToFacebookNewfeedsSuccessfully() {
        System.out.println("step 4");
    }
}
