package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodsTest {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.amazon.com.tr/");

        //Amazon sayfasina gidelim
        String amazonurl = "https://www.amazon.com/";//Tekrar ihtiyaç duyabilirrizi diye bu şekilde yaptık
        // url yi yazarken hata da yapabiliriz
        String techProUrl = "https://techproeducation.com/";
        driver.get(amazonurl);


        //Sayfa başlığını konsola yazdıralım
       String actualTitle = driver.getTitle();
        System.out.println("Amazon Sayfasını başlık bilgisi : " + actualTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Amazon Url : " + actualUrl);






        //Techproeducation sayfasına gidelim
        driver.get(techProUrl);


        //Sayfa başlığını konsola yazdıralım
        String techProEducationTitle = driver.getTitle();
        System.out.println("TechPro Sayfasının baslik bilgisi = " + techProEducationTitle);


        //Sayfanın Url'ini konsola yazdıralım
        String techProEducationUrl = driver.getCurrentUrl();
        System.out.println("TechPro Url : " + techProEducationUrl);






















    }

}
