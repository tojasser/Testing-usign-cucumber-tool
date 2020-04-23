package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public static final String PATH_SIGN_IN = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private static final String URL = "http://automationpractice.com";

    public HomePage(WebDriver driver) {
        super(driver, "My Store");
    }

    public void home() {
        super.goTo(URL);
    }

    public void signIn() {

        super.cssClick(PATH_SIGN_IN);
    }
}
