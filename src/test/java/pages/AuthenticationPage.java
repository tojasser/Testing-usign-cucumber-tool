package pages;

import automationpractice.User;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Page {
    private User user;

    public AuthenticationPage(WebDriver driver, User user) {
        super(driver, "Login - My Store");
        this.user = user;
    }

    public void createAnAccount() {
        fill("email_create", user.generateEmail());
        submit();
    }

    public void submit() {
        click("SubmitCreate");
    }

}
