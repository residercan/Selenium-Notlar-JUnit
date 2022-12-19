package day02_DersNotlari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Day02_WebelementAndLocators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));

        /*
        Mülakat sorularında önceliğimiz id ile locater işlemini yaptığımızı söyleriz.
        Ama her zaman Path ile locater işlemi yaparız
         */


        //------------By.id(Attributes)--------------//

        //Amazon sayfasına gidelim
        driver.get("http://www.amazon.com/");

        //Search bölümünü locate edelim
        driver.findElement(By.id("twotabsearchtextbox"));

        //Search bölümününde iphone aratalım
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("İphone", Keys.ENTER);
        /*
            Eğer bir webelementi (Web sayfasındaki herbir buton yada text/yazı) locate(konumunu belirleme)
        etmek istersek önce manuel olarak web sayfasını açıp sayfa üzerinde sağ click yapıp incele'ye tıklarız.
        Karşımıza çıkan HTML kodlarından locater'lardan (konum belirleyiciler) eşsiz olanı seçeriz.
        Genellikle id Attribute'u kullanılır. Seçtiğimiz attribute değerini findelement() methodu içine
        findelement(By.id("attribute değeri")) şeklinde yazarız.
         */


        //-----------By.name (attribute)--------------------//

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("İphone", Keys.ENTER);


        // Amazon sayfasındaki <input> ve <a> tag'larının sayısını yazdırınız.

        List<WebElement> inputTags = driver.findElements(By.tagName("input"));//tagları bulurken findelements kullanılır. sonunda s eki olur.
        System.out.println("Input Tag Sayısı: " + inputTags.size());

        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı: " + linklerList.size());
        for(WebElement w: linklerList) {
            System.out.println(w.getText());//elementleri for each yöntemi ile yazdırdık
        }








    }



}




