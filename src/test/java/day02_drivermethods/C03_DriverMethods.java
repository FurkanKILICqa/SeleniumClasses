package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //TechproEducation ana sayfasina gidelim . https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com/");//driver.get ile aynı işi yapar


        //Amazon soyfasina gidelim. https://www.amazon.com/
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");// get () methodu gibi string olarak girilen url e gider

        //Tekrar TechproEducation'sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();//Web sayfasıda bie önceki sayfaya döner

        //Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//Web sayfasına ileri gitme islei yapar


        //Sayfayi Refresh(yenile) yapalim
        Thread.sleep(3000);
        driver.navigate().refresh();


        //Sayfayi kapatalim / Tum sayfalari kapatalim
        Thread.sleep(3000);
        driver.quit();

        


















    }

}
