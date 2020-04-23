package automationpractice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;

import java.util.logging.Level;

import static java.util.logging.Logger.getLogger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AutomationPracticeSteps {

    static {
        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
    }


    private final WebDriver driver = new ChromeDriver();
    private final User user = new User();
    private final HomePage homepage = new HomePage(driver);
    private final AuthenticationPage authenticationPage = new AuthenticationPage(driver, user);
    private final RegistrationPage registrationPage = new RegistrationPage(driver, user);
    private final MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        homepage.home();
        assertTrue(homepage.isCurrent());
    }

    @When("I sign in")
    public void iSignIn() {
        homepage.signIn();
    }

    @And("enter an email address to create an account")
    public void enterAnEmailAddressToCreateAnAccount() {
        assertTrue(authenticationPage.isCurrent());
        authenticationPage.createAnAccount();
    }

    @And("I fill in the registration form")
    public void iFillInTheRegistrationForm() {

        registrationPage.fillInForm();
    }

    @And("I am registered and logged in")
    public void iAmRegisteredAndLoggedIn() {
        assertTrue(myAccountPage.isCurrent());
    }

    @And("try to create account without filling in the form")
    public void tryToCreateAccountWithoutFillingInTheForm() {
        registrationPage.submit();
    }

    @Then("I will get an error")
    public void iWillGetAnError() {
        assertEquals(8, registrationPage.getErrorCount());
    }

    @Then("I sign out")
    public void iSignOut() {
        myAccountPage.signOut();


    }

    @And("Enter email address and passowrd")
    public void enterEmailAddressAndPassowrd() {
        authenticationPage.logInCredentials();

    }

    @Then("I log in")
    public void iLogIn() {
        authenticationPage.logIn();
    }
}
