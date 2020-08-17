package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String titleAmazon = driver.getTitle().toLowerCase();
        if (titleAmazon.contains("books")) {
            System.out.println("books kelimesi geciyor");
        } else {
            System.out.println("books kelimesi gecmiyor");
        }

        driver.quit();


    }
}
