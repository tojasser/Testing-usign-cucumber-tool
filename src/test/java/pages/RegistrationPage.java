package pages;

import automationpractice.User;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;

public class RegistrationPage extends Page {
    private static final String PATH_ERRORS = "/html/body/div/div[2]/div/div[3]/div/div/p";

    private User user;

    public RegistrationPage(WebDriver driver, User user) {
        super(driver, "Login - My Store");
        this.user = user;
    }

    public void fillInForm() {
        click("id_gender1");
        fill("customer_firstname", "Tester");
        fill("customer_lastname", "wobble");
        fill("passwd", "wibble");
        selectFirst("days");
        selectFirst("months");
        selectFirst("years");
        fill("address1", "whereever");
        fill("city", "Troy");
        selectFirst("id_state");
        fill("postcode", "00000");
        selectFirst("id_country");
        fill("phone", "02340982304");
        fill("alias", "tester" + user.getId());
        submit();
    }

    public void submit() {
        click("submitAccount");
    }

    public int getErrorCount() {
        return parseInt(getText(PATH_ERRORS).split(" ")[2]);
    }

    @Override
    public boolean isCurrent() {
        return super.exists("account-creation-form");
    }
}
