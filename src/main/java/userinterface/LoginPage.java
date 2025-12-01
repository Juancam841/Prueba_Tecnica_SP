package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    //public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").locatedBy("//div[@class='d-none d-lg-block']//i[@class='fa fa-sign-in ml-2']");
    public static final Target INPUT_USER = Target.the("Textbox where we will write the username").locatedBy("//input[@id='user-name']");
    public static final Target INPUT_PASS = Target.the("Textbox where we will write the password").locatedBy("//input[@id='password']");
    public static final Target ENTER_BUTTON = Target.the("button that sends the credentials to validate").locatedBy("//input[@id='login-button']");
}
