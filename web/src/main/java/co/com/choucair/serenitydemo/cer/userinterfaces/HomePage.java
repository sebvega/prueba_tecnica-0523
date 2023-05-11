package co.com.choucair.serenitydemo.cer.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
//    public static final Target BTN_ADD_ITEM = Target.the("Label of bottom to add to chest")
//            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[2]/child::div/child::div/child::div[2]/child::div/child::div[2]/child::div[2]/child::button");
//    public static final Target BTN_PLUS_ITEM = Target.the("Label of add more items")
//            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[2]/child::div/child::div/child::div[2]/child::div/child::div[2]/child::div/child::button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus']");
//    public static final Target AMOUNT_ITEM = Target.the("Label of save amount of items")
//            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[2]/child::div/child::div/child::div[2]/child::div/child::div[2]/child::div/child::div[@class='exito-vtex-components-4-x-stepperContainerQty']");
//    public static final Target NAME_ITEM = Target.the("Label of name item")
//            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[1]/child::div/child::div/child::div[3]/child::div/child::div/child::div/child::h3/child::span");
//    public static final Target PRICE_ITEM = Target.the("Label of price item per unit")
//            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[1]/child::div/child::div/child::div[4]/child::div[3]/child::div/child::span");
//
//    public static final Target BTN_CART = Target.the("Input of quantity per unit.")
//            .locatedBy("//div[@class='exito-header-3-x-minicartContainer ']");
//


    public static final Target BTN_ADD_ITEM = Target.the("Label of bottom to add to chest")
            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[2]/child::div/child::div/child::div[2]/child::div/child::div/child::div/child::div");
    public static final Target BTN_ADD_TO_CAR = Target.the("Label of bottom to add to chest")
            .locatedBy("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 ']");

    public static final Target BTN_NEXT_BUY = Target.the("Label of bottom to add to chest new item")
            .locatedBy("//p[text()='Continuar comprando']");

    public static final Target BTN_PLUS_ITEM = Target.the("Label of add more items")
            .locatedBy("//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus']");

    public static final Target AMOUNT_ITEM = Target.the("Label of save amount of items")
            .locatedBy("//div[@class='exito-vtex-components-4-x-stepperContainerQty']");
    public static final Target NAME_ITEM = Target.the("Label of name item")
            .locatedBy("(//span[@class='vtex-store-components-3-x-productBrand '])[{0}]");
    public static final Target PRICE_ITEM = Target.the("Label of price item per unit")
            .locatedBy("(//div[@class='vtex-flex-layout-0-x-flexCol vtex-flex-layout-0-x-flexCol--product-info  ml0 mr0 pl0 pr0      flex flex-column h-100 w-100'])[{0}]/child::div[1]/child::div/child::div/child::div[4]/child::div[2]/child::div/child::span");

    public static final Target BTN_CART = Target.the("Input of quantity per unit.")
            .locatedBy("//div[@class='exito-header-3-x-minicartContainer ']");


    public static final Target LBL_TITLE_PRODUCT = Target.the("Label of title of product.")
            .locatedBy("//span[text()='{0}']");
    public static final Target LBL_TITLE_PRODUCTA = Target.the("Label of title of product.")
            .locatedBy("//div[@class='exito-checkout-io-0-x-summaryTotal']/child::div/child::span[2]");



}
