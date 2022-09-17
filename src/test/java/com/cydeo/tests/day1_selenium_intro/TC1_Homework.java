package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Homework {
    public static void main(String[] args) {
        /*
        TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to
https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
         */

        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        //making window full window screen/ maximizing
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");


        String expectedUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        //Verify      URL        title
        // expected: cydeo      Practice

        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL verification is PASSED!");
        }else{
            System.out.println("URL verification is FAILED!");
        }

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else{
            System.out.println("Title verification is FAILED!");
        }

        driver.quit();

    }
}
