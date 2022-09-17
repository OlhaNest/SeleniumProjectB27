package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://practice.cydeo.com/registration_form

        driver.get("https://practice.cydeo.com/registration_form");

       // 3- Verify header text is as expected: Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text verification is passed");
        }else{
            System.out.println("Header Text verification is failed");
        }

       // 4- Locate “First name” input box
        WebElement firstName = driver.findElement(By.name("firstname"));


       // 5- Verify placeholder attribute’s value is as expected: Expected: first name
        String expectedPlaceholder = "first name";
        String actualPlaceholder = firstName.getAttribute("placeholder");

        if(actualPlaceholder.equals(expectedPlaceholder)){
            System.out.println("Placeholder text verification is passed");
        }else{
            System.out.println("Placeholder text verification is failed");
        }

        driver.quit();
    }
}
