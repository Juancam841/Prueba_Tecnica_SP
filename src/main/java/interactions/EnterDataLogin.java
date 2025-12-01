package interactions;

import userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class EnterDataLogin implements Interaction {
    private final String user;
    private final String pass;

    public EnterDataLogin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static EnterDataLogin login(String user, String pass) {
        return Tasks.instrumented(EnterDataLogin.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                //Click.on(LoginPage.LOGIN_BUTTON),
                Enter.theValue(user).into(LoginPage.INPUT_USER),
                Enter.theValue(pass).into(LoginPage.INPUT_PASS),
                Click.on(LoginPage.ENTER_BUTTON)
        );
    }


}
