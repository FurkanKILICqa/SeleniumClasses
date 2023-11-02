package day03_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocators {

    public static void main(String[] args) {

        // Google sayfasına gidelim
        // Arama kutusunu "name" attribute e göre bularak "selenium" yazalim
        // Aramayı yapalim
        //Başlığın selenium içerdiğini test edelim
        //Sayfada kaç tane link olduğunu yazdıralım
        //Sayfadaki linklerin metinleri varsa konsola yazdıralım
        //sayfayı kapatalım



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Google sayfasına gidelim
        driver.get("https://google.com");

       WebElement searchBox = driver.findElement(By.name("q"));//Aynı name ile farklı atrebute ler olsaydı o zaman ilk bulduğunu verir

        //Arama kutusunu "name" attribute e göre bularak "selenium" yazalim
       searchBox.sendKeys("selenium");

        // Aramayı yapalim
       searchBox.submit();

       String actualTitle = driver.getTitle();

        //Başlığın selenium içerdiğini test edelim
       if (actualTitle.contains("selenium")){
           System.out.println("Test Pass");


       }else System.out.println("Test Fail");



        //Sayfada kaç tane link olduğunu yazdıralım
      List<WebElement> links = driver.findElements(By.tagName("a"));//a tagı ile başlayan tüm elemanların listine ver dedik
        System.out.println("Linklerin Sayısı = " + links.size());


        //Sayfadaki linklerin metinleri varsa konsola yazdıralım


        for (WebElement w : links) {

            if (!w.getText().isEmpty()){

                System.out.println(w.getText());
            }


        }
        driver.close();

        /*
        Eger birden fazla webelementi locate etmek istiyorsak findElements methodu kullaniriz.
        Bu method bize elemanlari weblement olan bir list return eder

        Bir webelemente ait yaziyi alabilmek icin getText() methodunu kullaniriz
         */








    }
}
