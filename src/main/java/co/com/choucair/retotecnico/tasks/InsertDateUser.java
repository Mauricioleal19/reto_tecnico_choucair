package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.InsertDatePage;
import co.com.choucair.retotecnico.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertDateUser implements Task {
    private String strName, strLastName, strEmail,strCity,strCode,strPassword,strConfirmPassword;

    public InsertDateUser(String strName, String strLastName, String strEmail, String strCity, String strCode, String strPassword, String strConfirmPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strCity = strCity;
        this.strCode = strCode;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static InsertDateUser the(String strName, String strLastName, String strEmail, String strCity, String strCode, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(InsertDateUser.class,strName,strLastName,strEmail,strCity,strCode,strPassword,strConfirmPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InsertDatePage.JOIN_BUTTON),
                Enter.theValue(strName).into(RegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(RegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(RegisterPage.INPUT_EMAIL),
                Click.on(RegisterPage.SELECT_MONTH),
                Click.on(RegisterPage.SELECT_DAY),
                Click.on(RegisterPage.SELECT_YEAR),
                Click.on(RegisterPage.NEXT_LOCATION),
               // Enter.theValue(strCity).into(RegisterPage.INPUT_CITY),
                Enter.theValue(strCode).into(RegisterPage.INPUT_CODE),
                Click.on(RegisterPage.NEXT_DEVICES),
                Click.on(RegisterPage.INPUT_MOBILE),
                Click.on(RegisterPage.SELECT_MOBILE),
                Click.on(RegisterPage.INPUT_MODEL),
                Click.on(RegisterPage.SELECT_MODEL),
                Click.on(RegisterPage.INPUT_SYSTEM),
                Click.on(RegisterPage.SELECT_SYSTEM),
                Click.on(RegisterPage.NEXT_STEP),
                Enter.theValue(strPassword).into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(RegisterPage.INPUT_CONFIRM),
                Click.on(RegisterPage.TERMS_USE),
                Click.on(RegisterPage.PRIVACY_SECURITY),
                Click.on(RegisterPage.COMPLETE_SETUP)
        );


    }
}
