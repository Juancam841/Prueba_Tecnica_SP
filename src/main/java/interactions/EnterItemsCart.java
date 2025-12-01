package interactions;

import userinterface.SearchItemsCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

public class EnterItemsCart implements Interaction {
    // private final String course;

    //public EnterItemsCart(String course) {
    //  this.course = course;
    //}

    public static EnterItemsCart items() {
        return Tasks.instrumented(EnterItemsCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(SearchItemsCart.BUTTON_ITEM1),
                Click.on(SearchItemsCart.BUTTON_ITEM2),
                Click.on(SearchItemsCart.BUTTON_CART)
        );
    }


}
