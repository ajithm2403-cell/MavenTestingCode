package pageobjectmanager;


import pageobjectmodel.CheckoutPage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.SearchProduct;
import utility.FileReaderManager;

public class PageObjectManager {

    private LoginPage loginPage;
    private FileReaderManager fileReader;
    private static PageObjectManager pageObjectManager;
    private SearchProduct searchProduct;
    private CheckoutPage checkoutPage;

    public CheckoutPage getCheckoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage();
        }
        return checkoutPage;
    }

    public static PageObjectManager getPageObjectManager() {
        if (pageObjectManager == null) {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public SearchProduct getSearchProduct() {
        if (searchProduct == null) {
            searchProduct = new SearchProduct();
        }
        return searchProduct;
    }

    public FileReaderManager getFileReader() {
        if (fileReader == null) {
            fileReader = new FileReaderManager();
        }
        return fileReader;
    }
}

