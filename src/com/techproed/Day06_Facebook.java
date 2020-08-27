package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://www.facebook.com/");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("techproed@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test1234");
        password.submit();
        //https://www.facebook.com/login/

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
          
        }

        String url = driver.getCurrentUrl();
        if (url.contains(url)) {
            System.out.println("giris yapilamadi");
        } else System.out.println("giris basarili");
    }
}
