import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowserTesting {
    static int browser;
    static String url = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 to test in Chrome");
        System.out.println("Select 2 to test in Firefox");
        System.out.println("Select 3 to test in Edge");
        browser=sc.nextInt();

        switch (browser){
            case 1:
                //Set Chrome driver path
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

                //Start Chrome browser
                driver = new ChromeDriver();
                break;

            case 2:
                //Set Chrome driver path
                System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");

                //Start Chrome browser
                driver = new FirefoxDriver();
                break;

            case 3:
                //Set Chrome driver path
                System.setProperty("webdriver.chrome.driver", "drivers/msedgedriver.exe");

                //Start Chrome browser
                WebDriver driver = new EdgeDriver();
                break;

            default:
                System.out.println("Select valid option");
                break;
        }

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is : " + driver.getPageSource());

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
