package webDriverCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class RediffCode {

    public static WebDriver driver;
    @Test
    public void testLoginFunctionality(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[class='signin']")).click();
        driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("tatabatata1@rediffmail.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("T@tabatata22");
        driver.findElement(By.cssSelector("input[id='remember']")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        //use assertion here
        driver.findElement(By.cssSelector("body > div.rd_wrapper.is_red_user > div.rd_header > div > div.setting_rd > a.rd_logout")).click();

        driver.close();
        driver.quit();
    }
}
