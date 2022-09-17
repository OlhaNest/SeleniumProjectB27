package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://google.com
        driver.get("https://google.com");

        Thread.sleep(2000);

       // 3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();

        Thread.sleep(2000);

       // 4- Verify title contains: Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }


       // 5- Go back to Google by using the .back();
        driver.navigate().back();

        Thread.sleep(2000);

       // 6- Verify title equals: Expected: Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification is passed");
        }else{
            System.out.println("Google title verification is failed");
        }

        driver.quit();
    }
}
