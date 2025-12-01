package questions;

import userinterface.SearchItemsCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String lblOpen = Text.of(SearchItemsCart.LBL_VALIDATION).answeredBy(actor);
        if(question.equals(lblOpen)) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

