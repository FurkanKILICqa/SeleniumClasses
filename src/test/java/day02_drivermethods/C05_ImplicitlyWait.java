package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ImplicitlyWait {

    public static void main(String[] args) {


        //Web otomasyonu yaparken mutlaka maximise yapmalıyız driverin tüm wep elementleri görebilmesi için

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Max 15 saniye sayfadaki web elementlerin oluşması için bekler

        /*
        Bir sayfaya gittigimizde internetten kaynakli islem yapilmak istenen web elementler hemen olusmayabilir
        Dolayisiyla islem yapilmak istenen webelement henüz olusmamis ise kodlarimiz bu elementi bulamaz ve hata aliriz
        Bu nedenle implicitly wait kullanarak isimizin cogunu hallederiz, bazi extra beklemeler icin explicit wait konusuu ögreneceğiz
         */

        //techpro sayfasına gidiniz
        driver.get("https://www.techproeducation.com/");

        //sayfa başlığının TechPro Education olduğunu test ediniz
        String expectedTitle = "TechPro Education";
        String actualTitle = driver.getTitle();

       // if (expectedTitle.equals(actualTitle)){
       //     System.out.println("Test Pass");
       //
       // }else {
       //     System.out.println("Test Fail");
       // }

        System.out.println(expectedTitle.equals(actualTitle) ? "Test Pass" : "Test Fail");//If ile de yapabiliriz

        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");

        //sayfa url'inin facebook içerdiğini test ediniz
        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //techpro sayfasına geri dönününüz
        driver.navigate().back();

        //Geri döndüğünüzü test ediniz
        actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //sayfayı kapatınız
        driver.close();



















    }
}
