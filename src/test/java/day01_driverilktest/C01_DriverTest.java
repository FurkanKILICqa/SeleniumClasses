package day01_driverilktest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_DriverTest {

    public static void main(String[] args) {


          WebDriverManager.chromedriver().setup();

          WebDriver chromedriver = new ChromeDriver();//Chrome browser  bağlanırız

          chromedriver.get("https://google.com");//Chrome browser dan google ı açar


        WebDriverManager.edgedriver().setup();

        WebDriver edgeDriver = new EdgeDriver();

        edgeDriver.get("https://google.com");


        /*
        WebDriverManager sayesinde istedigimiz browseri rahatlikla setup yaparak otomasyonda kullanabiliriz
        Bu sayede gerekli olan browseri bilgisayirimiza indirmek, yapilandirmak .. zorunda kalmayiz
         */

















    }

}
