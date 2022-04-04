package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class InsertDatePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that show us the form to register").
            located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));

}
