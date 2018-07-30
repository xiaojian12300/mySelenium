package com.itcast.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class Demo3 {

    WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        driver.get("file:///H:/baiduyun/%E6%B5%8B%E8%AF%95/webdriver_demo/selenium_html/index.html");
    }

    //@Test
    public void fun1() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='alert']/input")).click();
        Alert alert = driver.switchTo().alert();
        sleep(3000);
        alert.accept();
        sleep(3000);
    }

    //@Test
    public void fun2() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='prompt']/input")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("this is a prompt");
        sleep(3000);
        prompt.accept();
        sleep(3000);
        Alert prompt1 = driver.switchTo().alert();
        prompt1.accept();
        sleep(3000);
    }

    @Test
    public void fun3() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='confirm']/input")).click();
        Alert prompt = driver.switchTo().alert();
        sleep(3000);
        prompt.dismiss();
        sleep(3000);
        Alert prompt1 = driver.switchTo().alert();
        prompt1.accept();
        sleep(3000);
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
}
