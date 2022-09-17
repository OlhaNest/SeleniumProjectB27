package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {

      //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

      //  3. Search for “wooden spoon”
        WebElement searchWoodenSpoon = driver.findElement(By.name("search_query"));

        searchWoodenSpoon.sendKeys("wooden spoon" + Keys.ENTER);

        Thread.sleep(3000);


      //  4. Verify title: Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }

         driver.quit();


    }
}
