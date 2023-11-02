package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //TechPro sayfasina gidelim. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        Thread.sleep(3000);
        System.out.println("Sayfa Konumu == " + driver.manage().window().getPosition());
        System.out.println("Sayfa Ölçüleri == " + driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();//Sayfayı simge durumunda küçültür
        Thread.sleep(3000);

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();


        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfa Konumu == " + driver.manage().window().getPosition());
        System.out.println("Sayfa Ölçüleri == " + driver.manage().window().getSize());
        Thread.sleep(3000);


        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();// f11
        Thread.sleep(3000);


        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfa Konumu == " + driver.manage().window().getPosition());
        System.out.println("Sayfa Ölçüleri == " + driver.manage().window().getSize());


        //Sayfayi kapatin
        driver.close();




















    }
}
