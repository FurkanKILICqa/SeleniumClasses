package day04_WebElements_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C04_HomeWork {
    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");



        //Sayfa basliginin “Google” ifadesi icerdigini test edin
       String actualTitle = driver.getTitle();
       String acceptedTitle = "Google";

       if (actualTitle.contains(acceptedTitle)){
           System.out.println("Test Pass");

       }else System.out.println("Test Fail");



       //Arama cubuguna “Selenium” yazip aratin
        WebElement searchBox = driver.findElement(By.id("APjFqb"));

        searchBox.sendKeys("Selenium", Keys.ENTER);




        //Bulunan sonuc sayisini yazdirin
        WebElement searchResult = driver.findElement(By.xpath("(//div [@id='result-stats'])[1]"));

        System.out.println(searchResult.getText());//Yaklaşık 228.000.000 sonuç bulundu (0,26 saniye)




       //sonuc sayisinin 10 milyon’dan fazla oldugunu test edin












        //Sayfayi kapatin
       // Thread.sleep(3000);
       // driver.close();

















    }
}
