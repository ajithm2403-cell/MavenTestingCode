package runner;

import com.base.BaseClase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjectmanager.PageObjectManager;

public class TestRunner extends BaseClase  {
    public static void main (String[] args) throws Exception{

                launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
                launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
                PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
                PageObjectManager.getPageObjectManager().getCheckoutPage().checkOut();
                //screenshort(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty(value: "screenhort"));
                //PageObjectManager.getPageObjectManager().getSearchProduct().searchProduct();

            }
        }



