package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static ui.LoginPage.LBL_PRIVACY;

public class ErrorMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(LBL_PRIVACY).viewedBy(actor).asString();
    }

    public static ErrorMessage indicatingRequirementOfAcceptingPrivacyPolicy() {
        return new ErrorMessage();
    }
}
