package pageobjectmodel;

import com.base.BaseClase;
import interfaceelements.LoginInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectmanager.PageObjectManager;

public class LoginPage extends BaseClase implements LoginInterfaceElements {
    @FindBy(linkText = login_link)
    private static WebElement login;

    @FindBy(id = username_id)
    private static WebElement username;

    @FindBy(css = password_css)
    private static WebElement password;

    @FindBy(xpath = signin_xpath)
    private static WebElement signin;

    @FindBy(id = title_id)
    private static WebElement title;

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    public static void validLogin() throws InterruptedException {

        clickElement(login);
        Thread.sleep(2000);
        inputParse(username, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
        inputParse(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
        clickElement(signin);
        Thread.sleep(2000);
        //gettext(title);
    }
}
