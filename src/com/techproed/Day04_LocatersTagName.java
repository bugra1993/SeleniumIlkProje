package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatersTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://a.testaddressbook.com/");

        WebElement homeLink= driver.findElement(By.tagName("a"));
        String str=homeLink.getText();
        System.out.println(str);





    }
}
