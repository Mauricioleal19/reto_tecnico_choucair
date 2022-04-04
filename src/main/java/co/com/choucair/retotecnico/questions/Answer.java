package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.userinterface.EndRegister;
import co.com.choucair.retotecnico.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;


import java.awt.*;

public class Answer implements Question<Boolean> {
    private String endRegister;

    public Answer(String endRegister) {
        this.endRegister = endRegister;
    }

    public static Answer toThe(String strEndRegister) {
        return new Answer(strEndRegister);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String endReg = Text.of(EndRegister.END_REGISTER).viewedBy(actor).asString();
        return endRegister.equals(endReg);
    }
}
