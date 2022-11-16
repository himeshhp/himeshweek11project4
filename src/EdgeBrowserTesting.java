import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {
    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/";

        //Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "drivers/msedgedriver.exe");

        //Start Chrome browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is: " + driver.getPageSource());

        //Find and enter username in username field element
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        //Find and enter password in password field element
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        //Close browser
        driver.quit();
    }
}
