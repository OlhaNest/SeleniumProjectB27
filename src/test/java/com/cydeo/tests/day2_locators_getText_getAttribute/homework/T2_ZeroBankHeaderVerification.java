package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankHeaderVerification {
    public static void main(String[] args) throws InterruptedException {

      //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        Thread.sleep(3000);

      //  3. Verify header text: Expected: “Log in to ZeroBank”
        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text verification is PASSED");
        }else{
            System.out.println("Header Text verification is FAILED");
        }

        driver.quit();

    }
}
