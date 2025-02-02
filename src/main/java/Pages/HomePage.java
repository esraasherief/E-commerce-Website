package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver ;
    WebDriverWait wait ;

// Webdelements
    By addtocartbtn = By.xpath("//*[text()='ADD TO CART']");
    By cart = By.xpath("//img[@alt='Cart']");
    By proceedcheckout = By.xpath("//*[text()='PROCEED TO CHECKOUT']");
    By orderbtn = By.xpath("//*[text()='Place Order']");
    By lists = By.xpath("//*[@style='width: 200px;']");
    By checkbox = By.xpath("//*[@class='chkAgree']");
    By proceedbtn = By.xpath("//*[text()='Proceed']");
    By itemnum = By .xpath("//*[@type='number']");
    By incrementbtn = By.xpath("//*[@type='number']");

    //Constructor
    public HomePage (WebDriver driver)  {
         this.driver = driver;
         this.wait = new WebDriverWait(driver,Duration.ofSeconds(1000));
    }

    // Methods
    public  void incrementitems (){
        driver.findElement(incrementbtn).clear();
        driver.findElement(incrementbtn).sendKeys("3");
        wait.until(ExpectedConditions.elementToBeClickable(incrementbtn));

    }

    public void setAddtocartbtn (){
        wait.until(ExpectedConditions.elementToBeClickable(addtocartbtn));
        driver.findElement(addtocartbtn).click();
    }
    public void carticon(){
        driver.findElement(cart).click();
    }

    public  void proceed(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedcheckout));
        driver.findElement(proceedcheckout).click();
   }
    public void orderbtn(){
        wait.until(ExpectedConditions.elementToBeClickable(orderbtn));
        driver.findElement(orderbtn).click();
    }
    public void list(){
        WebElement list=  driver.findElement(lists);
        Select select = new Select(list);
        select.selectByVisibleText("Egypt");
   }
    public void termscondition(){
        driver.findElement(checkbox).click();
   }

    public void proceedbttn(){
       driver.findElement(proceedbtn).click();
   }



}
