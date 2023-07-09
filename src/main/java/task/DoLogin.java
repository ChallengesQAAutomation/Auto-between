package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static ui.LoginPage.BTN_LOGIN;
import static ui.LoginPage.BTN_PRIVACY;

public class DoLogin implements Task {


    public static DoLogin doLogin(){
        return new DoLogin();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }
}
