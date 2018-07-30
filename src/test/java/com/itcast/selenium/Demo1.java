package com.itcast.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Demo1 {

    @Test
    public void fun1(){
        System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
    }

    @Test
    public void fun2(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\IdeaProjects\\selenium_demo1\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void fun3(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\IdeaProjects\\selenium_demo1\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
    }


}
