package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class BuyPage {
    public static final Target SLK_CELL = Target.the("select element cellphones")
            .locatedBy("//android.widget.TextView[@text='Celulares']/ancestor::android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraintLayout_container_itemlist_hall']");
    public static final Target SLK_BUY_AND_PICK_UP = Target.the("select buy and pick up")
            .locatedBy("//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraitLayout_buy_and_collect']");
    public static final Target SLK_CITY = Target.the("select city to pick up")
            .locatedBy("//android.widget.Spinner[@resource-id='com.exito.appcompania:id/filled_exposed_dropdown_city']");
    public static final Target SLK_STORE = Target.the("select buy and pick up")
            .locatedBy("//android.widget.Spinner[@resource-id='com.exito.appcompania:id/filled_exposed_dropdown_store']");
    public static final Target BTN_TO_CONTINUE = Target.the("select buy and pick up")
            .locatedBy("//android.widget.Button[@resource-id='com.exito.appcompania:id/appCompatButton_continue']");
    public static final Target SLK_ITEM = Target.the("select ITEM")
            .locatedBy("(//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraintLayout_plp_item'])[3]/child::android.view.ViewGroup[2]");
    public static final Target SAVE_ITEM = Target.the("save item to verify")
            .locatedBy("(//android.view.ViewGroup[@resource-id='com.exito.appcompania:id/constraintLayout_plp_item'])[1]/child::android.view.ViewGroup[1]/child::android.widget.TextView[4]");


    public static final Target BTN_GO_TO_CAR = Target.the("select icon for pick up")
            .locatedBy("//android.widget.ImageView[@resource-id='com.exito.appcompania:id/appCompatImageView_shopping_cart']");


    public static final Target VALIDATE_CAR = Target.the("select buy and pick up")
            .locatedBy("//android.view.View/child::android.widget.TextView[contains(@text,'{0}')]");


}
