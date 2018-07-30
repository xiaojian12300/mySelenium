package com.itcast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Demo4 {
    WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        driver.get("file:///H:/baiduyun/%E6%B5%8B%E8%AF%95/webdriver_demo/selenium_html/index.html");
    }

    @Test
    public void fun1() throws InterruptedException {
        driver.switchTo().frame("aa");
        driver.findElement(By.linkText("baidu")).click();
        sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("id01")).click();
    }


    @AfterMethod
    public void close(){
        driver.quit();
    }
}
