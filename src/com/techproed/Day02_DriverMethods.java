package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");

        driver.manage().window().maximize();

        String pageTitle=driver.getTitle();

        String pageUrl= driver.getCurrentUrl();

        System.out.println(pageTitle);
        System.out.println(pageUrl);

        driver.quit();

    }
}
