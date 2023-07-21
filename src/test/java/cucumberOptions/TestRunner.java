package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        tags = "@Login"
)
public class TestRunner {
public static void quitDriver() {
    System.out.println("test runner");
}
}
