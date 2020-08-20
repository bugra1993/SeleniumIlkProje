package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("https://www.facebook.com/");

        String titleBeforeSignIn = driver.getTitle();
        System.out.println(titleBeforeSignIn);
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("bgrcmldg@gmail.com");
        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("Izmir35*");
        WebElement signIn = driver.findElement(By.name("login"));
        signIn.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        String titleAfterSignIn = driver.getTitle();
        System.out.println(titleAfterSignIn);

        if (titleBeforeSignIn.equals(titleAfterSignIn)) {
            System.out.println("log in has been unsuccessful");
        } else {
            System.out.println("log in successful");
        }
        driver.quit();

    }
}
