package com.cydeo.tests.day2_locators_getText_getAttribute.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_ClassLocatorPractice {
    public static void main(String[] args) throws InterruptedException {

       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        Thread.sleep(2000);

       // 3- Click to “Home” link
        // PS: Locate “Home” link using “className” locator

        WebElement linkHome = driver.findElement(By.className("nav-link"));
        linkHome.click();

        Thread.sleep(2000);

       // 4- Verify title is as expected: Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }

        driver.quit();
    }
}
