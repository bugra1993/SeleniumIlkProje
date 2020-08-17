package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/bugracamlidag/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        String titleYoutube=driver.getTitle();
        if(titleYoutube.contains("video")){
            System.out.println("title has video string");
        }else{
            System.out.println("title has not video string");
        }
        driver.quit();
    }
}
