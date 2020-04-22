package automationpractice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary"},
        strict = true,
        snippets = CAMELCASE,
        features = "src/test/resources/features")
public class RunAllFeatures {
}
