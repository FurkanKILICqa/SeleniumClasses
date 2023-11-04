package day04_WebElements_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Xpath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        /*
        / => bu direkt bir cocugu secer
            /html/body


        //=> Bu belgenin herhangi bir yerindeki bir elementi secmek icin kullanilir
            //div

        @ => Bir webelmentin attributee unu secmek icin kullanilir
            //input[@name='field-keywords']

        []=> kosullar veya index belirtmek icin kullanilir
            //input [2]

        * Hepsini secer

        SYNTAX

        //tagname [@attributeName ='attributeDegeri']
        //* [@* = 'attributedegeri' ]
        -> eger bu kullanimda birden fazla sonuc verirse * koydugumuz yerlere tagname ve attributename i belirtebiliriz
        -> buna ragmen birden fazla sonuc verirse o webelementin indexini asagidaki sekilde alabiliriz

        (//tagname [@attributeName ='attributeDegeri']) [index]

         */

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        driver.navigate().refresh();
        driver.navigate().refresh();

        //Arama kutusunda "city bike" aratin (arama kutusunu xpath ile locate edin)
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']"));

        aramaKutusu.sendKeys("city bike");

        aramaKutusu.submit();



        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement  aramaSonucu = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));

        System.out.println(aramaSonucu.getText());//1-16 of 269 results for "city bike" //gettext demezsek referans numarasını verir

        //Sadece sonuc sayısını yazdırınız
        String [] sonucSayisi = aramaSonucu.getText().split(" ");

        System.out.println("sonucSayisi = "+ sonucSayisi[2]);


        //Sonra karşınıza çıkan ilk sonucun metnine tıklayın.
        driver.findElement(By.xpath("(//h2)[1]")).click();
        //=>xpath alirken direkt taglari kullanarak unique sonuc vermezse yukarid yaptigimiz gibi index ile locate edebiliriz
        //önemli olan uniqe elde etmektir



        //sayfayi kapatınız
        driver.close();






    }
}
