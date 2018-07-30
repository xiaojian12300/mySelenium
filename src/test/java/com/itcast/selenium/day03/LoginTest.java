package com.itcast.selenium.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeTest
    public void before(){
        System.setProperty("webdriver.firefox.bin","D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        driver.get("https://mail.qq.com/");
        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    @DataProvider(name = "list")
    public Object[][] data(){
        return new Object[][]{
                {"714360775@qq.com","qq20061021qq"},
                {"916521599@qq.com","szwlly44556"}
        };
    }

    @Test(dataProvider = "list")
    public void fun1(String userName,String password) throws InterruptedException {
        driver.switchTo().frame("login_frame");
        driver.findElement(By.id("u")).sendKeys(userName);
        driver.findElement(By.id("p")).sendKeys(password);
        driver.findElement(By.id("login_button")).click();
        Thread.sleep(3000);
    }

   /* @AfterTest
    public void after(){
        driver.quit();
    }*/


}
