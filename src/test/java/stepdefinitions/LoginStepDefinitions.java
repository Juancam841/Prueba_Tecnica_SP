package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.GivenWhenThen;
import tasks.Login;
import tasks.OpenUp;
import questions.Answer;

public class LoginStepDefinitions {
    @Given("the user is on the serenity demo page")
    public void the_user_is_on_the_serenity_demo_page() {
        OnStage.theActorCalled("Juan").attemptsTo(
                OpenUp.thePage()

        );
    }
    @When("attempts to log in (.*) and (.*)$")
    public void attempts_to_log_in(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onThePage(user, pass)
        );
    }
    @Then("will validate the text on screen (.*)$")
    public void will_validate_the_text_on_screen_swag_labs(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(message)));
    }
}
