package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        //3. go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        driver.navigate().to("https://www.google.com");


        //navigate().to() method is loading to url in browser
        driver.navigate().to("https://www.tesla.com");


        String CurrentTitle = driver.getTitle();
        System.out.println("title = " + CurrentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentUrl);


        //stops execution of code for 3 sec
        Thread.sleep(3000);

        //navigate().back() method will take previous page
        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();
        // System.out.println("driver.getTitle() + " + driver.getTitle());

        //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().to("https://www.google.com");
        CurrentTitle = driver.getTitle();
        System.out.println("title = " + CurrentTitle);

        currentUrl = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentUrl);

        //close() method will close current opened page
      //  driver.close();

        //quit() method will all opened pages
        driver.quit();






    }
}
