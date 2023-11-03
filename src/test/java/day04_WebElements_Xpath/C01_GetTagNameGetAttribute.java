package day04_WebElements_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetTagNameGetAttribute {
    public static void main(String[] args) throws InterruptedException {



        //arama kutusunun class attribütunun değerinin form-input olduğunu test ediniz
        //sayfayı kapatınız

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //techproeducation sayfasına gidiniz
        driver.get("https://www.techproeducation.com/");


        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));

        //arama kutusunun tag name'inin input olduğunu test ediniz
        String actualTagName = searchBox.getTagName();
        String acceptedTagName = "input";

        if (actualTagName.equals(acceptedTagName)){
            System.out.println("Test Pass");

        }else System.out.println("Test Fail");

        //arama kutusunun class attribütunun değerinin form-input olduğunu test ediniz


        String actualAttributeValue = searchBox.getAttribute("class");//Direkt siteye gider oradan class attribütün den çeker
        String acceptedAttributeValue = "form-input";

        if (actualAttributeValue.equals(acceptedAttributeValue)){
            System.out.println("Test Pass");

        }else System.out.println("Test Fail");

        Thread.sleep(3000);

        driver.close();






    }
}
