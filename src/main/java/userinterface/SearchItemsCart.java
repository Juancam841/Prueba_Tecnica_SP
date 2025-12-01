package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchItemsCart extends PageObject {
    public static final Target BUTTON_CART = Target.the("").locatedBy("//a[@class='shopping_cart_link']");
    public static final Target BUTTON_ITEM1 = Target.the("").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target BUTTON_ITEM2 = Target.the("").locatedBy("//button[@id='add-to-cart-sauce-labs-bike-light']");
    public static final Target LBL_VALIDATION  = Target.the("").locatedBy("//div[@class='app_logo']");
    public static final Target LBL_ITEM1  = Target.the("").locatedBy("//a[@id='item_4_title_link']");
    public static final Target LBL_ITEM2  = Target.the("").locatedBy("//a[@id='item_0_title_link']");
}
