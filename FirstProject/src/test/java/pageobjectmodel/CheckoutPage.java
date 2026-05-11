package pageobjectmodel;

import com.base.BaseClase;
import interfaceelements.CheckOutInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectmanager.PageObjectManager;


public class CheckoutPage extends BaseClase implements CheckOutInterfaceElements {

    @FindBy(xpath = cart)
    private static WebElement cartin;

    @FindBy(xpath = place_order)
    private static WebElement placeorder;

    @FindBy(xpath = name_placeorder)
    private static WebElement nameplaceorder;

    @FindBy(xpath = card)
    private static WebElement cardno;
    @FindBy(xpath = purchase_btn)
    private static WebElement purchasebtn;
    @FindBy(xpath = ok_btn)
    private static WebElement okbtn;

    @FindBy(xpath = bill_text)
    private static WebElement billtext;

    @FindBy(xpath = log_out)
    private static WebElement logout;

    public CheckoutPage() {

        PageFactory.initElements(driver, this);
    }

    public static void checkOut() throws InterruptedException {

        clickElement(cartin);
        clickElement(placeorder);
        Thread.sleep(2000);
        inputParse(nameplaceorder, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("name"));
        inputParse(cardno, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("creditcard"));
        clickElement(purchasebtn);
        Thread.sleep(2000);
        getText(billtext);
        Thread.sleep(2000);
        clickElement(okbtn);
        Thread.sleep(2000);
        clickElement(logout);
        //gettext(title);
    }
}
