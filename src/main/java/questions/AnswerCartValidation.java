package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchItemsCart;


public class AnswerCartValidation implements Question<Boolean> {
    private String question1;
    private String question2;

    public AnswerCartValidation(String message2, String message3) {
        this.question1 = message2;
        this.question2 = message3;
    }

    public static AnswerCartValidation toThe(String message2, String message3) {
        return new AnswerCartValidation(message2, message3);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result1;

        String lblOpen1 = Text.of(SearchItemsCart.LBL_ITEM1).answeredBy(actor);
        if (question1.equals(lblOpen1)) {
            result1 = true;
        } else {
            result1 = false;
        }

        boolean result2;
        String lblOpen2 = Text.of(SearchItemsCart.LBL_ITEM2).answeredBy(actor);
        if (question2.equals(lblOpen2)) {
            result2 = true;
        } else {
            result2 = false;
        }
        boolean finalResult;

        if (result1==result2) {
            finalResult = true;
        } else {
            finalResult = false;
        }

        return finalResult;
    }
}

