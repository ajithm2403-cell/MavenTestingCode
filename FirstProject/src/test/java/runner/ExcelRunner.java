package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.ReadExcelData;

public class ExcelRunner {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");

        String username= ReadExcelData.getParticularData(0,0);
        driver.findElement(By.xpath("//input[@autocomplete='username webauthn']")).sendKeys(username);

        String password= ReadExcelData.getParticularData(3,1);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);


    }
}
