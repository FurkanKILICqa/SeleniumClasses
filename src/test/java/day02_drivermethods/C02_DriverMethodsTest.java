package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodsTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        String amazonUrl = "https://www.amazon.com/";
        driver.get(amazonUrl);

        //Sayfa basligini(title) yazdirin
        String actualTile = driver.getTitle();
        System.out.println("actualTile = " + actualTile);


        //Sayfa basliginin "Amazon" icerdigini test edin
        if (actualTile.contains("Amazon")){
            System.out.println("Test Passed");

        }else {
            System.out.println("Test fail");
        }

        Thread.sleep(3000);//Bu bekleme özelliği javadan gelir, driver ne olursa olsun 3 saniye bekleyecek demektir
                                    //Şuan öğrendiğimiz için bunu kullanıyoruz test uzmanları tread.sleep kullanmaktan kaçınmalıdır



        //Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);




        //Sayfa url'inin "amazon" icerdigini test edin.
        if (actualUrl.contains("amazon")){
            System.out.println("Test Pass");

        }else {
            System.out.println("Test Fail");
        }



        //Sayfa handle degerini yazdirin
        String amazonWindowHandle = driver.getWindowHandle();//Bir sayfaya gidip sonra tekrar o sayfaya dönmek istediğimizde
        // bu handle değerini kullanırız
        System.out.println("amazonWindowHandle = " + amazonWindowHandle);


        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String amazonHTML = driver.getPageSource();

        if (amazonHTML.contains("Gateway")){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }


        //Sayfayi kapatin.
        driver.close();//En son driverin içine bulunduğu sayfayı kapatır
        //driver.quit();//Bizim otomasyon ile açtığımız birden fazla sekme yada pencereyi kapatmak için kullanırız


















    }
}
