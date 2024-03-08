import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
    WebDriver driver;
    @BeforeTest
    public void testtenOnce(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void anaSayfaBaglanma(){
        driver.get("https://www.google.com");

    }
    @AfterTest
    public void testtenSonra(){
        driver.quit();
    }
}
