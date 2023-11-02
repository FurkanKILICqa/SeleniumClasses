package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       //ChromeDriver kullanarak, facebook sayfasina gidin
        driver.get("https://facebook.com");


        //sayfa basliginin (title) “Facebook” icerdigini dogrulayin (verify), degilse dogru basligi yazdirin.
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Pass");

        }
        else System.out.println("Actual Title : " + actualTitle);





        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i  yazdirin.
        String expectedUrl = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Test Pass");

        }
        else System.out.println("Actual Url : " + actualUrl );




        //https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(3000);
        driver.get("https://www.walmart.com/");


        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String acceptedTitleWalmart = "Walmart.com";
        String actualTitleWalmart = driver.getTitle();

        if (actualTitleWalmart.contains(acceptedTitleWalmart)){
            System.out.println("Test Pass");

        }
        else System.out.println("Test Fail");




        //Tekrar “facebook” sayfasina donun
        Thread.sleep(3000);
        driver.navigate().back();

        //Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();


        //sayfayi tam sayfa (maximize) yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();



    }


}
