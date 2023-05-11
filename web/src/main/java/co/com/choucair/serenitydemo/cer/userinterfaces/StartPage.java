package co.com.choucair.serenitydemo.cer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class StartPage {

    public static final Target BTN_MENU = Target.the("Select type of category")
            .locatedBy("id:category-menu");




    public static final Target BTN_CATEGORY = Target.the("Select type of category")
            .locatedBy("//p[text()='{0}']");
    public static final Target BTN_SUBCATEGORY = Target.the("Select  sub category")
            .locatedBy("//p[text()='{0}']");

}
