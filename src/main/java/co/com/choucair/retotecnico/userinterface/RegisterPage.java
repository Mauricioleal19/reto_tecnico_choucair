package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
//Identificar y mapear

public class RegisterPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("write the lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("write the month")
            .located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']//*[contains(text(),'May')]"));
    public static final Target SELECT_DAY = Target.the("write the day")
            .located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']//*[contains(text(),'19')]"));
    public static final Target SELECT_YEAR = Target.the("write the year")
            .located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']//*[contains(text(),'1992')]"));

    public static final Target NEXT_LOCATION = Target.the("next location of register")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));
    public static final Target INPUT_CITY = Target.the("write the city")
            .located(By.id("city"));
    public static final Target INPUT_CODE = Target.the("write the postal code")
            .located(By.id("zip"));


    public static final Target NEXT_DEVICES = Target.the("next devices of register")
            .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));

    public static final Target INPUT_MOBILE = Target.the("select mobile device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_MOBILE = Target.the("select mobile device Apple")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]/span/div"));

    public static final Target INPUT_MODEL = Target.the("select mobile model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_MODEL = Target.the("select model device Iphone 8")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[51]/span/div"));

    public static final Target INPUT_SYSTEM = Target.the("select mobile SYSTEM")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_SYSTEM = Target.the("select os device Iphone 8")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[81]/span/div"));


    public static final Target NEXT_STEP = Target.the("next last step of register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

    public static final Target INPUT_PASSWORD = Target.the("create password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM = Target.the("confirm password")
            .located(By.id("confirmPassword"));
    public static final Target TERMS_USE = Target.the("i have read and accept the terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_SECURITY =Target.the("i have read and accept the privacy and security policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("End User Registration")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));





}
