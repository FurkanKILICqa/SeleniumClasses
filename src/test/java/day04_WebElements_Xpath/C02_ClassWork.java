package day04_WebElements_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ClassWork {
    public static void main(String[] args) throws InterruptedException {


        //https://testcenter.techproeducation.com/index.php adresine gidin
        // "Back to TechProEducation.com" butonunun kullanici erisimi icin etkin olup olmadigini test edin


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://testcenter.techproeducation.com/index.php");

        //btn btn-primary btn-lg // class isminde boşlu olduğu için sorun olabilir o yüzden kullanmadık

        WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));

        System.out.println(backToButton.isEnabled() ? "Test Pass" : "Test Fail");


    // "Applications lists" basligini tagname ile locate ederek görünür  olup olmadigini test ediniz

        //Applications lists

        WebElement applicationsList = driver.findElement(By.tagName("h1"));

        if (applicationsList.isDisplayed()){

            System.out.println("Test Pass");

        }else System.out.println("Test Fail");

        Thread.sleep(3000);

        driver.close();
    }
}
