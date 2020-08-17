package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String googleTitle = driver.getTitle();
        System.out.println(googleTitle);
        driver.navigate().to("https://www.youtube.com/");
        String youtubeTitle = driver.getTitle();
        String youtubeUrl = driver.getCurrentUrl();
        System.out.println(youtubeTitle);
        System.out.println(youtubeUrl);
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println(googleUrl);
        driver.quit();
    }
}
