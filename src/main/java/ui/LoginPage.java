package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {


    public static final Target TXT_USERNAME = Target.the("Input text username")
            .located(By.id("email"));


    public static final Target TXT_PASSWORD = Target.the("Input text password")
            .located(By.id("password"));
    public static final Target LBL_PRIVACY = Target.the("Label text privacy")
            .located(By.id("privacyLabel"));
    public static final Target BTN_PRIVACY = Target.the("button privacy")
            .located(By.id("privacy"));

    public static final Target BTN_LOGIN = Target.the("button login")
            .located(By.id("submitBtn"));

}
