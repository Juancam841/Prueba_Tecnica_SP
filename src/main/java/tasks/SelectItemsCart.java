package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.SauceDemoPage;
import interactions.EnterItemsCart;


public class SelectItemsCart implements Task {
    private SauceDemoPage sauceDemoPage;

    public static SelectItemsCart thePage() {
        return Tasks.instrumented(SelectItemsCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
              EnterItemsCart.items() );
    }
}
