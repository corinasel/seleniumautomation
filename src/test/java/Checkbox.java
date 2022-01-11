import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Corina/Desktop/manual testing/Selenium testing/chromedriver.exe"); // set the path of chromedriver
        WebDriver driverChrome=new ChromeDriver();
        driverChrome.get("https://formy-project.herokuapp.com/checkbox");
        Thread.sleep(3000);
        driverChrome.findElement(By.id("checkbox-1")).click();
        Thread.sleep(3000);

       WebElement checkbox2= driverChrome.findElement(By.id("checkbox-2"));
       checkbox2.click();
       Thread.sleep(3000);
       driverChrome.findElement(By.id("checkbox-3")).click();
       Thread.sleep(3000);
       driverChrome.quit();

    }
}
