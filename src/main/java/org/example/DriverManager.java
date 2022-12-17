package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils{

    public void openBrowser() {
//        set driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
//      opening Chrome browser
        driver = new ChromeDriver();
//        TO OPEN HOM PAGE OF URL
        driver.get("https://demo.nopcommerce.com/");
        //       waiting for the loading the web page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Keeping the browser in full screen mode
        driver.manage().window().maximize();

    }

    //To close browser
    public void closeBrowser() {
        driver.quit();
    }

}
