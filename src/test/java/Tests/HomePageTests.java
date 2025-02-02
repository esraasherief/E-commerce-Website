package Tests;

import org.testng.annotations.Test;

public class HomePageTests  extends  Basetest{


    @Test
    public void Scenarios(){

       shopping.setAddtocartbtn();
       shopping.incrementitems();
       shopping.carticon();
       shopping.proceed();
       shopping.orderbtn();
       shopping.list();
       shopping.termscondition();
       shopping.proceedbttn();


    }


}
