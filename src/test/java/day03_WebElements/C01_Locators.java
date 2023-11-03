package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {





//Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
//sayfayı kapatınız



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        /*
        Locate ettigimiz webelement <input> tagina sahip ise o webelemente sendKeys methodu ile istedigimiz texti gonderebiliriz
        Eger bir arama kutusunu locate edip text gönderirsek iki sekilde enter tusuna bastirabilirliz
        1) submit() methodu
        2) Keys.ENTER
         */

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");


        //1. Yol

      //  //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
      //  WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
      //  //driver.findElement(By.id("twotabsearchtextbox"));//eğer bir sefer kullanacaksak bu şekilde yazarız

      //  aramaKutusu.sendKeys("iphone");//arama kutusuna iphone yazdırır

      //  aramaKutusu.submit();//aratır

      //


       //2.Yol
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);



        //3.Yol name attribute
        driver.findElement(By.name("field-keywords")).sendKeys("iphone", Keys.ENTER);


        driver.close();

       // Bugun ogrendigimiz Selenium Interview Sorulari--02.11.2023
       // 1--Seleniumdaki locatorlardan bahseder misiniz?
       // 2--Siz hangi locatori kullanmayi tercih edersiniz,neden?
       // 3--findElement() ve findElements() methodlari arasindaki farklar nelerdir?


        //1--Seleniumdaki locatorlardan bahseder misiniz?








    }
}
