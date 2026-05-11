package com.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

import java.time.Duration;

public abstract class BaseClase {
    public static WebDriver driver;

    protected static WebDriver launchBrowser(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            }
        } catch (Exception e) {
            Assert.fail("Error : occurred  launching browser");
        }
        driver.manage().window().maximize();
        return driver;
    }


    protected static void launchUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            Assert.fail("Error: launching URl");
        }
    }

    protected static void inputParse(WebElement element, String input) {
        try {
            element.sendKeys(input);
        } catch (Exception e) {
            Assert.fail("Error: occurred passing input");
        }
    }

    protected static void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            Assert.fail("Error: clicking the element");
        }
    }

    protected static void quitBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            Assert.fail("Error: closing the Browser");
        }
    }

    protected static void navigateTO(String url) {
        try {

            driver.navigate().to(url);
        } catch (Exception e) {
            Assert.fail("Error: Navigating to another page ");
        }
    }

    protected static void navigateAction(String action) {
        try {
            if (action.equalsIgnoreCase("back")) {
                driver.navigate().back();
            } else if (action.equalsIgnoreCase("forward")) {
                driver.navigate().forward();
                ;
            } else if (action.equalsIgnoreCase("refresh")) {
                driver.navigate().refresh();
            }
        } catch (Exception e) {
            Assert.fail("Error: Navigating Action ");
        }
    }

    protected static void alertsAction(String action) {
        try {
            Alert alert = driver.switchTo().alert();
            if (action.equalsIgnoreCase("accept")) {
                alert.accept();
            } else if (action.equalsIgnoreCase("dismiss")) {
                alert.dismiss();
            }
        } catch (Exception e) {
            Assert.fail("Error: Alerts ");
        }
    }

    protected static void promtAlert(String action, String value) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys(value);
            if (action.equalsIgnoreCase("accept")) {
                alert.accept();
            } else if (action.equalsIgnoreCase("dismiss")) {
                alert.dismiss();
            }
        } catch (Exception e) {
            Assert.fail("Error: Alerts ");
        }
    }

    protected static void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    protected static void elementsEnabled(WebElement element, String type) {
        if (type.equalsIgnoreCase("isselected")) {
            boolean status = element.isSelected();
            if (status) {
                System.out.println("Web element is Selected");
            } else {
                System.out.println("Web element is Selected");
            }
        } else if (type.equalsIgnoreCase("isEnabled")) {
            boolean status = element.isEnabled();
            if (status) {
                System.out.println("Web element is enabled");
            } else {
                System.out.println("Web element is enabled");
            }
        }
            else if (type.equalsIgnoreCase("isDisplayed")) {
                boolean status = element.isDisplayed();
                if (status) {
                    System.out.println("Web element is Displayed");
                } else {
                    System.out.println("Web element is Displayed");
                }
        }
    }
    protected static void getTitle() {
        String title=driver.getTitle();
        System.out.println(title);
    }
    protected static void getCurrentUrl() {
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
    }
    protected static void getText(WebElement element){
        String text=element.getText();
        System.out.println(text);
    }


}