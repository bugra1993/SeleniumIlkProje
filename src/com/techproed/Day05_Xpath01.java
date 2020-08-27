package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://a.testaddressbook.com/");
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        WebElement emailBox= driver.findElement(By.xpath("//input[@type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordBox= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordBox.sendKeys("Test1234!");
        passwordBox.submit();

    }
}
