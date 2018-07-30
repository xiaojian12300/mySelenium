package com.itcast.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo5 {
    WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        driver.get("file:///H:/baiduyun/%E6%B5%8B%E8%AF%95/webdriver_demo/selenium_html/index.html");
    }

    @Test
    public void fun1() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("load")).sendKeys("C:\\Users\\Administrator\\Desktop\\mirror.xml");
        //C:\Users\Administrator\Desktop\mirror.xml
        Thread.sleep(3000);
    }


    @AfterMethod
    public void close(){
        driver.quit();
    }
}
