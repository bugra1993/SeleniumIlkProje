package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        WebElement homeLink;
        homeLink = driver.findElement(By.partialLinkText("Home"));
        homeLink.click();

    }
}
