package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatersGiris1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://a.testaddressbook.com/");
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement emailBox = driver.findElement(By.className("form-control"));
        emailBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordBox;
        passwordBox = driver.findElement(By.id("session_password"));
        passwordBox.sendKeys("Test1234!");
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();


    }
}
