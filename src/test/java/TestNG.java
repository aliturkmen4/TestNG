import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void basariliMailTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Bu bir basarili mail testidir!");
        driver.close();
    }

    @Test
    public void basarisizMailTesti(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Bu bir basarisiz mail testidir!");
        driver.close();
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @Test
    public void test4(){
        System.out.println("test4");
    }
}
