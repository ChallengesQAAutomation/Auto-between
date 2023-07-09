package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static ui.LoginPage.*;

public class PrivacyPolicy implements Task {


    public static PrivacyPolicy acceptPolicy(){
        return new PrivacyPolicy();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PRIVACY));
    }
}
