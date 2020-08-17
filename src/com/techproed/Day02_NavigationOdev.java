package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.navigate().to("https://www.youtube.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.manage().window().maximize();

        driver.quit();
    }
}
