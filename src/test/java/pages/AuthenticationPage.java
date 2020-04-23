package pages;

import automationpractice.User;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Page {
    private User user;
    private static String email;
    private static final String EMAIL_PATH="email";
    private static final String PASSWORD_PATH="passwd";
    private static final String SING_IN_PATH="#SubmitLogin > span";


    public AuthenticationPage(WebDriver driver, User user) {
        super(driver, "Login - My Store");
        this.user = user;
    }

    public void createAnAccount() {
      //  email=this.user.generateEmail();
        fill("email_create", user.generateEmail());
        submit();
    }

    public void logInCredentials(){
        //fill(EMAIL_PATH,"tester-765634870@testing.com");
        fill(EMAIL_PATH, user.getEmail());
        fill(PASSWORD_PATH,"wibble");

    }

    public void logIn(){
        cssClick(SING_IN_PATH);
    }


    public void submit() {
        click("SubmitCreate");
    }

}
