package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("city bike");
        searchBox.submit();
        //WebElement searchButton = driver.findElement(By.name("btnK"));
        //searchButton.click();
        WebElement resultState = driver.findElement(By.id("result-stats"));
        System.out.println(resultState.getText());
        WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();

        driver.quit();


    }
}
