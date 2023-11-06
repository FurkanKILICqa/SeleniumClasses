package day05_xpath_cssselector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Homework {
    public static void main(String[] args) {


        /*
    ÖDEV:
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    Add Element butonuna basin 100 kez basınız
    Delete butonuna 90 kez basınız
    Ve 90 kez basıldığını doğrulayınız
     */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

       WebElement clics = driver.findElement(By.xpath("//*[ contains ( text(),'Add Element' )]"));


       //Add Element butonuna basin 100 kez basınız
      int actualClics = 0 ;
      for (int i = 0; i <100 ; i++) {

          clics.click();
          actualClics++;


          System.out.println("actualClics = " + actualClics);
       }


        //Delete butonuna 90 kez basınız
        WebElement buttonDelete = driver.findElement(By.xpath("//div[@id='elements']"));
        int deleteButtonClickCounter = 0;

        for (int j = 0; j < 90; j++) {
            buttonDelete.click();
            deleteButtonClickCounter++;
        }
        System.out.println("Delete Butonu tiklama sayisi = " + deleteButtonClickCounter);



        //90 kez basıldığını doğrulayınız
        int expectedDeleteClick = 90;

        if (expectedDeleteClick==deleteButtonClickCounter){
           System.out.println("Test Passed");
       }else {
           System.out.println("Test Failed");
       }

        driver.close();
















    }
}
