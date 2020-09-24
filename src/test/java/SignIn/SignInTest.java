package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInTest {
    private WebDriver driver;
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://identity.getpostman.com/login?addAccount=1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("talk2salmaan@gmail.com");
        driver.findElement(By.id("password")).sendKeys("new5func");
        driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]")).click();
        Thread.sleep (10000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        SignInTest test = new SignInTest();
        test.setUp();

    }
    }
