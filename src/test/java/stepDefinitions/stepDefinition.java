package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User open browser and access to Rahulshetty page$")
    public void User_open_browser_and_access_to_rahulshetty_page() {
        System.out.println("step 1");
    }

    @When("^User input username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void User_input_Username_and_password(String string, String string2) {
        System.out.println("step 2");
        System.out.println(string);
        System.out.println(string2);
    }

    @When("^User click Login$")
    public void User_click_login() {
        System.out.println("step 3");
    }

    @Then("^Verify User can access to Rahulshetty newfeeds successfully$")
    public void verify_User_can_access_to_Rahulshetty_newfeeds_successfully() {
        System.out.println("step 4");
    }
}
