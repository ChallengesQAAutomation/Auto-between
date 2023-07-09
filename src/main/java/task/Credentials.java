package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static ui.LoginPage.TXT_PASSWORD;
import static ui.LoginPage.TXT_USERNAME;

public class Credentials implements Task {
    String username, password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public static Credentials intoCredentials(String username, String password){
        return new Credentials(username, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(username).into(TXT_USERNAME)
        ,Enter.keyValues(username).into(TXT_PASSWORD));
    }
}
