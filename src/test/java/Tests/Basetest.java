package Tests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {

    WebDriver driver;
    HomePage shopping;

    @BeforeMethod
    public void setup() {
        driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        shopping = new HomePage(driver);
    }


    @AfterMethod
    public void Teardown(){
        //driver.quit();
    }


}
