package tasks;

import interactions.EnterDataLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Login implements Task {
    private final String user;
    private final String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Login onThePage(String user, String pass) {
        return Tasks.instrumented(Login.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterDataLogin.login(user, pass));

    }
}
