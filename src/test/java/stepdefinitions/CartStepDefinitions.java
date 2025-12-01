package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.SelectItemsCart;
import questions.AnswerCartValidation;
import net.serenitybdd.screenplay.GivenWhenThen;

public class CartStepDefinitions {

    @When("user select item")
    public void user_select_item() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectItemsCart.thePage()
        );
    }
    @Then("will validate the selected items (.*) and (.*)$")
    public void will_validate_the_selected_items(String message2, String message3) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCartValidation.toThe(message2,message3)));
    }
}
